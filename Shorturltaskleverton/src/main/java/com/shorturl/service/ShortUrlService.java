package com.shorturl.service;

import com.shorturl.URL;
import com.shorturl.respository.ShortUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ShortUrlService {

    @Autowired
    ShortUrlRepository shortUrlRepository;

    public List getAllUrls()
    {
        List<URL> listofurls =  new ArrayList<URL>();
        shortUrlRepository.findAll().forEach(listofurls::add);
        return listofurls;

    }

    public void addUrl(String actualURL)
    {
        URL url = new URL(actualURL);
        shortUrlRepository.save(url);
    }

    public void delete(Integer id)
    {
        shortUrlRepository.deleteById(id);
    }

}
