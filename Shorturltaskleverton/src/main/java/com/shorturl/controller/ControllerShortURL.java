package com.shorturl.controller;

import com.shorturl.URL;
import com.shorturl.service.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerShortURL {

    @Autowired
    private ShortUrlService urlService;


    @RequestMapping("/urls")
    public List<URL> getAllUrls()
    {
       return urlService.getAllUrls();
    }

    @RequestMapping(method = RequestMethod.POST , value = "urls")
    public void add(@RequestBody String actualURL)
    {
         urlService.addUrl(actualURL);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "urls/{id}")
    public void remove(@PathVariable int id)
    {
        urlService.delete(id);
    }



}
