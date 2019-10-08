package io.github.qyvlik.logbackexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void startup() {
        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }

}
