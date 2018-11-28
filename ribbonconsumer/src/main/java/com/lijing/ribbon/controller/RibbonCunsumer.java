package com.lijing.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class RibbonCunsumer {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/helloconsumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return restTemplate.getForEntity("http://hello-server:8001/demo/hello",String.class).getBody();
        //return null;
    }

}
