package com.shorturl.service;

import com.shorturl.URL;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ShortUrlService {

    List<URL> listofurls =  Arrays.asList(
            new URL("facebook.com","fbs"),
                new URL("andjndl","aa")
        );

    public List getAllUrls()
    {
        return listofurls;
    }
}
