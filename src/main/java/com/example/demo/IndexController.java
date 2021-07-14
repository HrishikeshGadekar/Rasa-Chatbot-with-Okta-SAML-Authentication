package com.example.demo;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css");
    }
}