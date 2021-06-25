package com.laughingsquad.employeemanagementsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aasish 2021-05-07
 */

@RestController
@RequestMapping(path = "/test")
public class Test {

    @GetMapping
    public String display(){
        return "Hello World";
    }

}
