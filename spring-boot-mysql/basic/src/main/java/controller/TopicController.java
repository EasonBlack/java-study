package com.eason.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpSession;
import java.util.*;

import com.eason.service.TopicService;
import com.eason.entity.Topic;

@RestController
public class TopicController {
    @Autowired 
    private TopicService topicService;

    @RequestMapping(value={"/topics/hello"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public String Hello() { 
        return "Hello World";
    }

    @RequestMapping(value={"/topics"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public @ResponseBody Iterable<Topic> getAllTopics() { 
        return topicService.getAllTopics();
    }

    @RequestMapping(value={"/topics/{keywordId}"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
    public @ResponseBody Iterable<Topic> getTopicsByKeywordId(@PathVariable Long keywordId) { 
        return topicService.getTopicsByKeywordId(keywordId);
    }

    @RequestMapping(value={"/topics"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
    public void addTopic(@RequestBody Topic topic) { 
        topicService.addTopic(topic);
    }

    @RequestMapping(value={"/topics/{id}"}, method={org.springframework.web.bind.annotation.RequestMethod.DELETE})
    public void deleteTopic(@PathVariable Long id) { 
        topicService.deleteTopic(id);
    }

    @RequestMapping(value={"/topics"}, method={org.springframework.web.bind.annotation.RequestMethod.PUT})
    public void updateTopic(@RequestBody Topic topic) { 
        topicService.updateTopic(topic);
    }
}


