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
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
		name = "getAllUser", 
		procedureName = "GetAllUser", 
		resultClasses = { User.class }
	),
	@NamedStoredProcedureQuery(
		name = "getAllUser2", 
		procedureName = "GetAllUser2", 
		resultClasses = { User.class }
	),
	@NamedStoredProcedureQuery(
		name = "getUserByName", 
		procedureName = "GetUserByName", 
		resultClasses = { User.class },
		parameters = {
			@StoredProcedureParameter(
				mode = ParameterMode.IN, 
				name = "userName", 
				type = String.class),
			@StoredProcedureParameter(
				mode = ParameterMode.OUT, 
				name = "userCount", 
				type = Integer.class)
		}
	)
})
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
    private String num;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

}