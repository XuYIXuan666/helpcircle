package com.xm.helpcircle.web.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ControllerText {

    @RequestMapping("")
    public String getText(){
        return "hello world";
    }

}
