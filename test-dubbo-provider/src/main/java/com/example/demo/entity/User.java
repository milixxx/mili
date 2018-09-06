package com.example.demo.entity;

import java.io.Serializable;

public class User implements  Serializable{
	
	private Long id;
	
	private String uname;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	

}
