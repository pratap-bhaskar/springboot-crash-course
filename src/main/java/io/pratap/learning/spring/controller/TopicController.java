package io.pratap.learning.spring.controller;

import io.pratap.learning.spring.models.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @GetMapping(path = "/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
          new Topic("spring", "Spring Framework", "Spring Description"),
                new Topic(".net", "Dot Net", "Dotnet Description")
        );
    }
}
