package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.entity.User;
import com.example.demo.service.TestService;

@RestController
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Reference(version="1.0.0")
    private TestService testService;

    
    @ApiOperation(value="查询所有用户", notes="返回分页数据")
    @ResponseBody
    @RequestMapping(value="/my",method={RequestMethod.POST})
    public List<User> findAllUser() {
    	logger.info("TestController.findAllUser-----------------start----------");
    	return testService.findAllUser();
    }
    
}
