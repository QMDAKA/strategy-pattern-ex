package com.company.db;

public class SavePSQL implements SaveDatabase{
    @Override
    public void Save() {
        System.out.println("save to psql");
    }
}
