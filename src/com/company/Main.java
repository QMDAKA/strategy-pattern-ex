package com.company;

import com.company.db.SaveMysql;
import com.company.send.Send;
import com.company.send.SendToBoss;
import com.company.send.SendToOneUser;

public class Main {

    public static void main(String[] args) {
//        Send send = new Send(new SendToOneUser());
//        send.doSend();
//        Send send2 = new Send(new SendToBoss());
//        send2.doSend();
        SaveMysql db = new SaveMysql();
        SendToBoss send = new SendToBoss();
        Job job = new Job(send, db);
        job.doJob();
    }
}
