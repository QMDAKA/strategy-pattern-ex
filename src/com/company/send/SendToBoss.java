package com.company.send;

import java.util.List;

public class SendToBoss implements SendMail{
    @Override
    public List<String> doSendMail() {
        // logic code
        System.out.println("send to boss ");
        return List.of("boss 1", "boss 2 ");
    }
}
