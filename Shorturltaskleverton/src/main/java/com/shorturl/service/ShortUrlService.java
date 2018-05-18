package com.shorturl.service;

import com.shorturl.URL;
import org.springframework.stereotype.Service;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ShortUrlService {

    List<URL> listofurls =  new ArrayList<URL>(
            Arrays.asList(
                    new URL("123","facebook.com","face"),
                    new URL("23","andjndkankadkas","ands")
    ));
    static Random random = new Random();

    public List getAllUrls()
    {
        return listofurls;
    }

    public void addUrl(URL url)
    {
        listofurls.add(url);
    }

    public void delete(String id)
    {
        URL url = listofurls.stream().filter(t->t.getId().equals(id)).findFirst().get();
        listofurls.remove(url);
    }

    public static String hashShortString(String s)
    {
        StringBuilder hashString = new StringBuilder();
        random.setSeed( System.currentTimeMillis());
        int index =0;
        for(int i=0;i<(s.length())/2;i++)
        {
            while ((index = random.nextInt(s.length()))>=s.length()) {

            }

            hashString.append(s.charAt(100));

        }

        return hashString.toString();

    }
}
