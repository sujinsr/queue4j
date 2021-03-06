package com.kafka4j.poc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Log4jTest 
{
	static Logger log = Logger.getLogger(Log4jTest.class.getName());
	private enum level { DEBUG, INFO, WARN, ERROR, FATAL }  

    public static void main( String[] args )
    {
    	String message1 = "test";
    	message1 = message1 + level.DEBUG;
    	System.out.println(message1.length());
    	DateFormat df = new SimpleDateFormat("HH:mm:ss");
    	System.out.println(df.format(new Date()));
    	
    	for(int i = 0; i < 9000000; i++) {
    		String message = "In this tutorial, I am listing down 3 ways to know the difference between two dates in java. "
    				+ "Fist way is to calculate using Jodatime API which was available even before java 8 release. "
    				+ "Later 2 ways are using new Date Time API features available since java 8.";
    		
    		log.info(message + i);
    	}
    	
    	System.out.println(df.format(new Date()));
    }
}
