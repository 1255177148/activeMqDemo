package com.example.activemqdemo.mq;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SendMq {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送消息
     * @param destination 消息目的地
     * @param message 消息内容
     */
    public void sendMessage(String destination, String message){
        if (StringUtils.isNotBlank(destination)){
            jmsMessagingTemplate.convertAndSend(destination, message);
        }
    }
}
