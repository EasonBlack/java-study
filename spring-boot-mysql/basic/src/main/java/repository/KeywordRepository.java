package com.eason.repository;

import com.eason.entity.Topic;

import org.springframework.data.repository.CrudRepository;

public interface KeywordRepository extends CrudRepository<Topic, Long> {

}