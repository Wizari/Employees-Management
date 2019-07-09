package org.r78.employeesmanagement.controllers;


import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


//@Slf4j
@Component
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
//        log.info("An INFO Message");




        return "Howdy! Check out the Logs to see the output...";
    }
}
