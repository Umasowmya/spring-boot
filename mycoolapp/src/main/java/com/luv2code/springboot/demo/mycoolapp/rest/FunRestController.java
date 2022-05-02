package com.luv2code.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String hello(){
        return "Hello World"+ LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String workout(){
        return "run a hard 5k run";
    }


    @GetMapping("/fortune")
    public String fortune(){
        return "Fortune service ";
    }


    @GetMapping("/teamInfo")
    public String teamInfo(){
        return "Coach "+coachName +"team "+teamName;
    }



}
