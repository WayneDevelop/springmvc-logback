package com.wayne.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping( value = "/")
    public String  index(){
        logger.info("1111111111111");
        logger.error("22222222222");
        return "home";
    }
}
