package com.github.gorden5566.struts2.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldAction {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldAction.class);

    public String helloworld() {
        logger.info("helloworld action!");

        return "success";
    }

}
