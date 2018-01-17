package com.eason.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.eason.entity.Topic;
import com.eason.repository.TopicRepository;
import java.util.*;

@Service
public class TopicService {

    @Autowired 
    private TopicRepository topicRepository;

    public Iterable<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Iterable<Topic> getTopicsByKeywordId(Long id) {
        return topicRepository.findByKeywordId(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(Long id) {
        topicRepository.delete(id);
    }

    public void updateTopic(Topic topic) {        
        topicRepository.save(topic);
    }


}