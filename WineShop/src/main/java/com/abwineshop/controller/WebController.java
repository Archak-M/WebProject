package com.abwineshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class WebController {

    @GetMapping("index")
    public String getHome(){
        log.info("Get called...");
        return "index";
    }
}
