package com.yunusbagriyanik.springai.controller;

import com.yunusbagriyanik.springai.service.SpringAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SpringAIController {

    private final SpringAIService aiService;

    public SpringAIController(SpringAIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/course-compass")
    public String courseCompass(@RequestParam String promptCreateCourse) {
        return aiService.courseCompass(promptCreateCourse);
    }

    @GetMapping("/book-recommendation")
    public String bookRecommendation(@RequestParam String category, @RequestParam String year) {
        return aiService.bookRecommendation(category, year);
    }
}