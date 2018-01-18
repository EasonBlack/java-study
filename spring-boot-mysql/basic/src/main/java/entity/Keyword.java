package com.eason.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

import com.eason.entity.Topic;


@Entity 
public class Keyword {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	private String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="keyword")
	private List<Topic> topicList = new ArrayList(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Topic> getTopicList() {
		return topicList;
	}

	public void setTopicList( List<Topic> topicList) {
		this.topicList = topicList;
	}

}