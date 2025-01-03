package com.akashonlinehere.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

@Controller
public class HelloWorldController {
    // controller method to show initial HTML form
    @GetMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    // need a controller to process form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    // need a controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){

        // read request parameter from HTML form
        String theName = request.getParameter("studentName");

        // convert all to caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Yo! "+ theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    // need a controller method to read form data and add data to the model
    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model){

        // convert all to caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Hey my Friend! "+ theName;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
}
