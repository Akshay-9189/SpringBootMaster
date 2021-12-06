package com.csi.com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HP on 06-Dec-21.
 */

@RestController
@RequestMapping("/")
public class ApplicationController {

    @GetMapping("/hi")
    public String sayHello(){

        return  "Welcome To CSI";
    }
    
    @GetMapping("/services")
    public String csiServices(){
    	return "Payment Gateway";
    }
}
