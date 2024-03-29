package com.courseapi.app.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

   private List<Topic> topics =  new ArrayList<Topic> (Arrays.asList( Topic.builder().id("1").name("java").description("java descp").build(),
                Topic.builder().id("2").name("sql").description("sql descp").build(),
                Topic.builder().id("3").name("api").description("api descp").build()));

   public List<Topic> getAllTopics(){
       return topics;

   }


    public Topic getTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

    }

    public void addTopic(Topic topic) {
       topics.add(topic);
    }

    public void removeTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }

    public void updateTopic(String id,Topic topic) {

        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(id.equals(t.getId())){
                topics.set(i,topic);
                return;
            }
        }

    }
}
