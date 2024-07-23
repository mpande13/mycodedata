package com.pcm2.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class CustomLogger {
	
	public static boolean loggerStarted =false;
	public static Logger logger;
	public static FileHandler fh; 
	
	public static void startLogger(String loggerPath,String loggerName) throws SecurityException, IOException {
		
		if (!loggerStarted) {
			Constants.loggerPath =loggerPath;
			Constants.loggerName =loggerName; 
			Random rng = new Random();
			logger = Logger.getLogger(CustomLogger.class.toString() + "_" + rng.nextDouble());
			configLogger(Constants.loggerPath, Constants.loggerName, 1024 * 1024, 10, true);
			loggerStarted = true;			
			//logger.info("Logger Started");
		}
	}

	public static void configLogger(String path, String name, int size, int count, Boolean app)
			throws SecurityException, IOException {

		if (path != null && !path.isEmpty()) {
			File file = new File(path);
			if (file.isDirectory()) {
				String logPath = path + "/" + name + ".%g" + ".txt";
				logPath = Paths.get(logPath).toString();
				fh = new FileHandler(logPath, size, count, app);
				logger.addHandler(fh);

				fh.setFormatter(new Formatter() {
					@Override
					public String format(LogRecord record) {
						return record.getMessage() + System.getProperty("line.separator");
					}
				});
				logger.setUseParentHandlers(false);
			}
		}
	}
	
	public static void print(String msg) {
		if(loggerStarted) {
			logger.info(msg);
		}
	}

	public static void closeLogger() {
		if (fh != null) {
			fh.close();
		}
		loggerStarted = false;
	}

}
