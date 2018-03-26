package com.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.service.TestService;
import com.dao.impl.TestDaoImpl;
import com.entities.User;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestDaoImpl testDaoImpl;

	@Override
	public List<User> getUserList() {
		return testDaoImpl.getUserList();
	}

}
