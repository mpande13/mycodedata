package com.completestate.control;

import java.io.IOException;
import java.util.logging.Logger;

import com.mks.api.response.APIException;
import com.pcm2.main.CustomLogger;
import com.pcm2.main.connection.SourceConnection;

public class RunConnectionSpecificToBUser {

	SourceConnection connection = null;

	private static String host = "pcm-d.global.schindler.com";
	private static String port = "7001";

	public Logger startCustomLogger(String path, String loggerName) throws SecurityException, IOException {
		CustomLogger.startLogger(path, loggerName);
		return CustomLogger.logger;
	}

	public void closeCustomLogger() {
		CustomLogger.closeLogger();
	}

	public SourceConnection getConnectionInstance() {
		if (connection == null) {
			connection = new SourceConnection();
			try {
				connection.createConnection(host, port, "pandem3", "ManPan123$");
			} catch (APIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}

}
