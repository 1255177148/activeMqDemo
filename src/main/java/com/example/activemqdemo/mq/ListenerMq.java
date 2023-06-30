package com.example.activemqdemo.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerMq {

    @JmsListener(destination = "test")
    public void receiveMessage(String message){
        System.out.println("接收到的消息是：" + message);
    }
}
