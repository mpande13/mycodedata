package com.pcm2.main;

import com.pcm2.main.connection.Connection;

public class Constants {	 
	
	public static  String ORDER = "ORDER";
	public static  String DELIMITER = "^";
	public static  String EMPTY = "NULL";
	public static  String PLATFORM = "Platform";
	public static  String MAIN_PL = "Main PL";
	public static  String MAIN_BG = "Main Elevator Comp";
	
	public static String PROJECT="Project";	
	public static String loggerName="PCM2Logger";	
	public static String loggerPath=System.getProperty("user.dir");
	public static String masterdataPath=System.getProperty("user.dir");
	public static String pdmPath=System.getProperty("user.dir");
	public static boolean enableLogger = false;
	public static Connection connection=null;
	public static String taskCategoryFilePath=System.getProperty("user.dir");
	public static String processFlowFilePath=System.getProperty("user.dir");
	
	
}
