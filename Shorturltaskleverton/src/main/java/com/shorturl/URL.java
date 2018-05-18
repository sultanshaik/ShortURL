package com.shorturl;

public class URL {


    private String id;
    private String actualURL;
    private String shortURL;

    public URL() {
        this.id =id;
        this.actualURL = actualURL;
        this.shortURL = shortURL;
    }

    public URL(String id,String actualURL, String shortURL) {
        this.id =id;
        this.actualURL = actualURL;
        this.shortURL = shortURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
