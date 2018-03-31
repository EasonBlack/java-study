package com.dao.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.hibernate.exception.ConstraintViolationException;

import com.dao.TestDao;
import com.entities.User;

@Repository
public class TestDaoImpl  implements TestDao {

  List<User> users = Arrays.asList(
    new User(1, "aaa"),
    new User(2, "bbb"),
    new User(3, "dddd")
  );

	@Override
	public List<User> getUserList() {
		return users; 
	}


}
