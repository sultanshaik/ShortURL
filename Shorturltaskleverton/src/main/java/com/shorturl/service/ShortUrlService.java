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
                    new URL("123","facebook.com",hashShortString("facebook.com")),
                    new URL("23","andjndkankadkas",hashShortString("andjndkankadkas"))
    ));
    static Random random = new Random();

    public List getAllUrls()
    {
        return listofurls;
    }

    public void addUrl(String actualURL)
    {
        URL url = new URL(Integer.toString(random.nextInt(100)),actualURL , hashShortString(actualURL));
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

            hashString.append(s.charAt(index));

        }

        return hashString.toString();

    }
}
