package com.divya.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 
public class Log4j2HelloWorldExample
{
    private static final Logger LOGGER = LogManager.getLogger(Log4j2HelloWorldExample.class.getName());
    
    public static void main(String[] args)
    {
        LOGGER.debug("Debug Message Logged !!!");
        LOGGER.warn("Warn Message Logged !!!");
        LOGGER.error("Error Message Logged !!!", new NullPointerException("NullError"));
        LOGGER.info("Info Message Logged !!!");
        LOGGER.trace("Trace Message Logged!!!");
        
    }
}