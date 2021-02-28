package com.example.jdbc.firstjdbc;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")

public class User  {

	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User()
	{
		
	}
	@Id
	Integer id;
	@Column
	String name;
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
	
}
