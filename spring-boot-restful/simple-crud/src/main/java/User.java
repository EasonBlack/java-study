package com.eason;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.*;
import java.io.Serializable;

@Entity 
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
	private Integer num;

	public User() {}
	
	public User(String name, Integer num) {
        this.name = name;
        this.num = num;
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
    
    public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

}