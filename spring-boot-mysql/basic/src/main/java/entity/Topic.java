package com.eason.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;

import com.eason.entity.Keyword;

@Entity 
public class Topic {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Keyword keyword;

	public Topic() {
		
	}

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

	// public Keyword getKeyword() {
	// 	return keyword;
	// }

	// public void setKeyword(Keyword keyword) {
	// 	this.keyword = keyword;
	// }


}