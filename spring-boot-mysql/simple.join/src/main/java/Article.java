package com.eason;

import javax.persistence.*;
import java.io.Serializable;

@Entity 
public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private Long user_id;

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
    
    public Long getUserId() {
		return user_id;
	}

	public void setUserId(Long userid) {
		this.user_id = userid;
	}

}