package com.example.activemqdemo.controller;

import com.example.activemqdemo.mq.SendMq;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private SendMq sendMq;

    @GetMapping("testSend")
    public void testSend(@RequestParam("message") String message){
        for (int i = 0;i < 5; i++){
            sendMq.sendMessage("test", message + i);
        }
    }
}
