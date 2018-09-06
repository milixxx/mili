package com.example.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.dao.TestDao;
import com.example.demo.entity.User;
import com.example.demo.service.TestService;

@Service(version="1.0.0",timeout=5000)//ali的service，注意版本和超时时间。默认超时为1000ms
public class TestServiceImpl implements TestService{

	
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	@Resource
	private TestDao testDao;

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		logger.info("TestServiceImpl.findAllUser------start");
		return testDao.findAllUser();
	}

}
