package com.shorturl;

public class URL {

    private String actualURL;
    private String shortURL;

    public URL(String actualURL, String shortURL) {
        this.actualURL = actualURL;
        this.shortURL = shortURL;
    }

    public String getActualURL() {

        return actualURL;
    }

    public void setActualURL(String actualURL) {
        this.actualURL = actualURL;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }
}
