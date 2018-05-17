package com.shorturl.controller;

import com.shorturl.URL;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ControllerShortURL {

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping("/urls")
    public List<URL> hello()
    {
        return Arrays.asList(
                new URL("facebook.com","fbs"),
                new URL("andjndl","aa")
        );
    }
}
