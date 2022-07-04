package com.example.tusk.controller;


import com.example.tusk.repository.feedbackRepo;
import com.example.tusk.database.feedbackdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class indexController {
    @Autowired
    private feedbackRepo feedbackrepo;

    /*@GetMapping("/feedback")
    public String feedback()
    {
        return "index.html";
    }*/
    @PostMapping("/submit")
    public String addFeedback(@RequestParam String name, @RequestParam String email/*, @RequestParam int code*/,@RequestParam String msg,  @RequestParam String star) throws Exception
    {
        try {
            feedbackdb feedback = new feedbackdb();
            feedback.setName(name);
            //feedback.setCode(code);
            feedback.setEmail(email);
            //feedback.setRating(star);
            feedback.setMessage(msg);
            //feedback.setRegarding(regarding);
            feedbackrepo.save(feedback);
            return "index.html";
        } catch(Exception e){
            throw e;
        }
    }
}
