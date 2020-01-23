package com.michael;

import org.apache.log4j.Logger;
public class App {
	
	final static Logger logger= Logger.getLogger(App.class);
	
	private void call(String s) {
		if(logger.isDebugEnabled())
			logger.debug("This is debug"+s);
		if(logger.isInfoEnabled())
			logger.debug("This is info "+s);
		
		logger.warn("This is warn"+s);
		logger.error("This is error"+s);
		logger.fatal("This is fatal"+s);
	
	}
	
    public static void main( String[] args ){
    	App a1= new  App();
    	a1.call("Sam");
    }
}
