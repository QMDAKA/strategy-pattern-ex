package com.company;

import com.company.db.SaveDatabase;
import com.company.send.SendMail;

public class Job {
    private SendMail sendMail;
    private SaveDatabase saveDatabase;

    public Job(SendMail sendMail, SaveDatabase saveDatabase) {
        this.sendMail = sendMail;
        this.saveDatabase = saveDatabase;
    }

    public void doJob() {
        this.sendMail.doSendMail();
        this.saveDatabase.Save();
    }
}
