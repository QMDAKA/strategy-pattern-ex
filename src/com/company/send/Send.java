package com.company.send;

import java.util.List;

public class Send {
    private final SendMail sendMail;

    public Send(SendMail sendMail) {
        this.sendMail = sendMail;
    }

    public void doSend() {
        List<String> list = this.sendMail.doSendMail();
        System.out.println(list);
    }

}
