package org.bluebird.quiz.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class LoggerTest {

    //importing the class Logger from org.apache.etc packages
    private static final Logger LOGGER = LogManager.getLogger(LoggerTest.class);

    @Test
    public void logTest(){
        LOGGER.info("The user story: //given - //when - //then");
        LOGGER.info("We cannot have the user story in the logTest");
        LOGGER.info("Because there is not return value");
    }
}
