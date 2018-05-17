package com.shorturl.controller;

import com.shorturl.URL;
import com.shorturl.service.ShortUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerShortURL {

    @Autowired
    private ShortUrlService urlService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/urls")
    public List<URL> getAllUrls()
    {
       return urlService.getAllUrls();
    }
}
