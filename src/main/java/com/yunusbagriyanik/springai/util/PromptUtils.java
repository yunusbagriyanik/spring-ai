package com.yunusbagriyanik.springai.util;

import org.springframework.ai.prompt.PromptTemplate;

public class PromptUtils {
    public static PromptTemplate promptCourseCompass() {
        return new PromptTemplate("""
                You are an expert in creating online courses and teaching resources. I want you to create a course teaching {promptCreateCourse}.\s
                Begin with an overview of the subject. Then create chapters covering all of the important aspects of the topic.\s
                Then break each chapter down into sections covering the most important points related to each aspect. Include a table of contents at the start.\s
                For each chapter, include links to websites or online resources offering suggestions for further reading.
                """);
    }

    public static PromptTemplate promptBookRecommendation() {
        return new PromptTemplate("""
                I'm diving into some book research and would love your recommendation.\s
                Can you suggest a standout book in the {category} genre from {year}?\s
                I trust your judgment in picking the best.

                Please provide the information in the following JSON format:

                    {
                        {
                        "category": "{category}",
                        "year": "{year}",
                        "bookName": "Your Book Name",
                        "author": "Author Name",
                        "review": "Your Review",
                        "smallSummary": "A brief summary of the book."
                        }
                    }
                """);
    }
}
