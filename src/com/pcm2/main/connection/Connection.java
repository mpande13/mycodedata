package com.pcm2.main.connection;

import java.io.IOException;

import com.mks.api.CmdRunner;
import com.mks.api.response.APIException;



public interface Connection {	
	
	public void createConnection(String host,String port,String user,String password)throws APIException;
	public void createLocalConnection() throws APIException;
	public void releaseConnection() throws IOException, APIException;
	public CmdRunner getCmdRunner();
	public String getHost();
	public String getPort();
		
}
