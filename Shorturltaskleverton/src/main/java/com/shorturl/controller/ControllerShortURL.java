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

    @CrossOrigin("http://localhost:3000")
    @RequestMapping("/urls")
    public List<URL> getAllUrls()
    {
       return urlService.getAllUrls();
    }

    @CrossOrigin("http://localhost:3000")
    @RequestMapping(method = RequestMethod.POST , value = "urls")
    public void add(@RequestBody String actualURL)
    {
         urlService.addUrl(actualURL);
    }

    @CrossOrigin("http://localhost:3000")
    @RequestMapping(method = RequestMethod.DELETE,value = "urls/{id}")
    public void remove(@PathVariable int id)
    {
        urlService.delete(id);
    }



}
