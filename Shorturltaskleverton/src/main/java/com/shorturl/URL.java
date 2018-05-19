package com.shorturl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class URL {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String actualURL;
    private String shortURL;

    public URL() {
        this.actualURL = actualURL;
    }

    public URL(String actualURL) {
        this.actualURL = actualURL;
        this.shortURL = hashShortString(actualURL);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    static Random random = new Random();

    public static String hashShortString(String s)
    {
        StringBuilder hashString = new StringBuilder();
        random.setSeed( System.currentTimeMillis());
        int index =0;
        for(int i=0;i<(s.length())/2;i++)
        {
            while ((index = random.nextInt(s.length()))>=s.length()) {

            }

            hashString.append(s.charAt(index));

        }

        return hashString.toString();

    }

}
