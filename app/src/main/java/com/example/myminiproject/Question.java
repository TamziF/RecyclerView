package com.example.myminiproject;

public class Question {
    private String subject;
    private String question;

    Question(String subject, String question){
        this.subject = subject;
        this.question = question;
    }

    String getSubject(){
        return this.subject;
    }

    String getQuestion(){
        return this.question;
    }

    void setSubject(String subject){
        this.subject = subject;
    }

    void setQuestion(String question){
        this.question = question;
    }
}
