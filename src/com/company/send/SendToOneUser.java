package com.company.send;

import java.util.List;

public class SendToOneUser implements SendMail {
    @Override
    public List<String> doSendMail() {
        System.out.println("send to user");
        return List.of("minnh");
    }
}
