package com.example.rest;

public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public void setId(long val){
        id = val;
    }
    public void setContent(String val){
        content = val;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}