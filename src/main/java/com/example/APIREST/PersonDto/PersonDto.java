package com.example.APIREST.PersonDto;

import java.util.Date;

public class PersonDto {
    String name;
    String userName;
    Date date;

    public PersonDto() {

    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }
}