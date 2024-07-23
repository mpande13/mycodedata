package com.pcm2.main.connection;

import java.io.IOException;
import java.util.Map;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.Option;
import com.mks.api.Session;
import com.mks.api.response.APIException;
import com.pcm2.main.Constants;

public class SourceConnection implements Connection {

	private String host;
	private String port;
	private String user;
	private String password;
	private CmdRunner cmdRunner = null;
	
	public SourceConnection() {
		
		System.setProperty("jdk.tls.client.protocols", "SSLv3,TLSv1,TLSv1.1,TLSv1.2");
		System.setProperty("https.protocols", "TLSv1.2");		
	}

	public String getHost() {
		return host; 
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public CmdRunner getCmdRunner() {
		return cmdRunner;
	}

	public void setCmdRunner(CmdRunner cmdRunner) {
		this.cmdRunner = cmdRunner;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void releaseConnection() throws IOException, APIException {
		if (cmdRunner != null && cmdRunner.getSession() != null) {
			this.cmdRunner.getSession().release();
			this.cmdRunner = null;
		}
	}

	@SuppressWarnings("deprecation")
	@Override
	public void createConnection(String hostName, String port, String user, String pass) throws APIException {

		this.host = hostName;
		this.port = port;
		this.user = user;
		this.password = pass;
		IntegrationPointFactory factory = IntegrationPointFactory.getInstance();
		IntegrationPoint intPt = factory.createIntegrationPoint(this.host, Integer.parseInt(this.port), true, 4, 16);

		this.cmdRunner = intPt.createSession(this.user, this.password).createCmdRunner();
		testConnection();
		Constants.connection=this;
	}

	@Override
	public void createLocalConnection() throws APIException {
		
		Map<String, String> env = System.getenv();
		this.host = env.get("MKSSI_HOST");
		this.port = env.get("MKSSI_PORT");
		this.user = env.get("MKSSI_USER");
		IntegrationPointFactory ipf = IntegrationPointFactory.getInstance();
		IntegrationPoint mksIP = ipf.createLocalIntegrationPoint(4, 14);
		Session session = mksIP.getCommonSession();
		mksIP.setAutoStartIntegrityClient(true);
		this.cmdRunner = session.createCmdRunner();
		testConnection();
		Constants.connection=this;

	}

	public void testConnection() throws APIException {
		
			Command cmd = new Command(Command.IM, "connect");
			cmd.addOption(new Option("hostname", this.host));
			cmd.addOption(new Option("port", this.port));
			cmd.addOption(new Option("user", this.user));
			cmd.addOption(new Option("password", this.password));
			cmdRunner.execute(cmd);
			cmdRunner.setDefaultUsername(this.user);
			cmdRunner.setDefaultPassword(this.password);
			cmdRunner.setDefaultHostname(this.host);
			cmdRunner.setDefaultPort(Integer.parseInt(this.port));
			cmdRunner.getSession().setAutoReconnect(true);
		
	}

}
