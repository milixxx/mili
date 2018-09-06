package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

public interface TestDao {

	List<User> findAllUser();

}
