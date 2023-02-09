package com.mastercraft.rest.api.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Users {
    private int id;
    private String fullName, age, dateGenerated, dateUpdated;

    public Users(int id, String fullName, String age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.dateGenerated = this.currentDateTime();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        this.dateUpdated = this.currentDateTime();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
        this.dateUpdated = this.currentDateTime();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        this.dateUpdated = this.currentDateTime();
    }

    public String getDateGenerated() {
        return dateGenerated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated() {
        this.dateUpdated = this.currentDateTime();
    }

    @Override
    public String toString() {
        return "User: {" +
                "id: " + id +
                ", fullName: '" + fullName + '\'' +
                ", age: '" + age + '\'' +
                ", dateGenerated: '" + dateGenerated + '\'' +
                ", dateUpdated: '" + dateUpdated + '\'' +
                '}';
    }

    private String currentDateTime() {
        String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
}
