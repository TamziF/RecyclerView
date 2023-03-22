package com.example.myminiproject;

public class Account {
    private String name;

    Account (String name){
        this.name = name;
    };

    String getName(){
        return this.name;
    }

    void setName(String name){
        this.name = name;
    }
}
