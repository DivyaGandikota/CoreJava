package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {

    public static Logger LOGGER; // = LogManager.getLogger(LoggerExample.class.getName());
    
    public static void testLogger(Class clazz) {

    	LOGGER  = LogManager.getLogger(clazz.getName());
    	
    
    }

}
