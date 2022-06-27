package com.example.tusk.controller;


import com.example.tusk.repository.feedbackRepo;
import com.example.tusk.database.feedbackdb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class indexController {
    @Autowired
    private feedbackRepo feedbackrepo;

    /*@GetMapping("/feedback")
    public String feedback()
    {
        return "index.html";
    }*/
    @PostMapping("/submit")
    public String addFeedback(@RequestParam String name, @RequestParam String email, @RequestParam String message, @RequestParam Integer regarding, @RequestParam String code, @RequestParam Integer rating)
    {
        feedbackdb feedback = new feedbackdb();
        feedback.setName(name);
        feedback.setCode(code);
        feedback.setEmail(email);
        feedback.setRating(rating);
        feedback.setMessage(message);
        feedback.setRegarding(regarding);
        feedbackrepo.save(feedback);
        return "index.html";
    }
}
