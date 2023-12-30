package com.yunusbagriyanik.springai.service;

import com.yunusbagriyanik.springai.util.PromptUtils;
import org.springframework.ai.client.AiClient;
import org.springframework.ai.client.AiResponse;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SpringAIService {

    @Qualifier("openAiClient")
    private final AiClient aiClient;

    public SpringAIService(AiClient aiClient) {
        this.aiClient = aiClient;
    }

    public String courseCompass(String promptCreateCourse) {
        PromptTemplate promptTemplate = PromptUtils.promptCourseCompass();
        promptTemplate.add("promptCreateCourse", promptCreateCourse);
        return this.aiClient.generate(promptTemplate.create()).getGeneration().getText();
    }

    public String bookRecommendation(String category, String year) {
        PromptTemplate promptTemplate = PromptUtils.promptBookRecommendation();
        Map.of("category", category, "year", year).forEach(promptTemplate::add);
        AiResponse generate = this.aiClient.generate(promptTemplate.create());
        return generate.getGeneration().getText();
    }
}