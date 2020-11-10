package ru.job4j.pojo;

import java.util.GregorianCalendar;

public class Student {
    private String fullName;
    private String group;
    private GregorianCalendar entranceDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public GregorianCalendar getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(GregorianCalendar entranceDate) {
        this.entranceDate = entranceDate;
    }
}
