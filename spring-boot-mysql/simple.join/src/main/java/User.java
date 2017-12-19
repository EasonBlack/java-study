package com.eason;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity 
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
	private String num;
	
	@OneToMany(targetEntity = Article.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName="id")
    private List<Article> articles;

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
    
    public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public List getArticles() {
        return articles;
    }
 
   

}