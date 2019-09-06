package com.tm.helpcircle.web.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@SpringBootApplication
public class ControllerText {

    @RequestMapping("getUser")
    public Map<String, Object> getUser(){
        System.out.println("微信小程序正在调用。。。");
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wanger");
        list.add("mazi");
        map.put("list",list);
        System.out.println("微信小程序调用完成。。。");
        return map;
    }

    @RequestMapping("getWord")
    public Map<String, Object> getText(String word){
        Map<String, Object> map = new HashMap<String, Object>();
        String message = "我能力有限，不要为难我";
        if ("后来".equals(word)) {
            message="这一天天。";
        }else if("微信小程序".equals(word)){
            message= "想获取更多微信小程序相关知识，请更多的阅读微信官方文档，还有其他更多微信开发相关的内容，学无止境。";
        }else if("杭师大".equals(word)){
            message="杭州示范大学简称'杭师大'";
        }
        map.put("message", message);
        return map;
    }

    @RequestMapping("")
    public String getText(){
        return "hello world";
    }

}
