package com.example.springFacam.proxy;

public class Browser implements IBrowser{
    private String url;
    public Browser(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        return null;
    }
}
