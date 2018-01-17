package com.eason.repository;

import com.eason.entity.Topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {
    public Iterable<Topic> findByKeywordId(long keywordId);
}