package com.zxf.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
      return "hello spring boot!";
    }
}

