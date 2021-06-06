package com.company.send;

public class SendFactory {
    // TODO initialize hashmap of instance
    public SendMail getSendType(String type) {
        if (type.equalsIgnoreCase("user")) {
            return new SendToOneUser();
        }
        if (type.equalsIgnoreCase("boss")) {
            return new SendToBoss();
        }
        return null;
    }
}
