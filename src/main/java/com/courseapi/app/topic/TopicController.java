package com.courseapi.app.topic;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> returnTopic(){
        return Arrays.asList( Topic.builder().id("1").name("java").description("java descp").build(),
                Topic.builder().id("2").name("sql").description("sql descp").build(),
                Topic.builder().id("3").name("api").description("api descp").build());

    }
}
