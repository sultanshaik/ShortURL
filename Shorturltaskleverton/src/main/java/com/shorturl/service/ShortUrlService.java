package com.shorturl.service;

import com.shorturl.URL;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ShortUrlService {

    List<URL> listofurls =  new ArrayList<URL>(Arrays.asList(
            new URL("facebook.com","fbs"),
                new URL("andjndl","aa")
        ));

    public List getAllUrls()
    {
        return listofurls;
    }

    public void addUrl(URL url)
    {
        listofurls.add(url);
    }
}
