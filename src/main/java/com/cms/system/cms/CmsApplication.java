package com.cms.system.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class CmsApplication {
    
    private static final Logger logger = LoggerFactory.getLogger(CmsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CmsApplication.class, args);
        logger.info("Application Started......");
    }
}
