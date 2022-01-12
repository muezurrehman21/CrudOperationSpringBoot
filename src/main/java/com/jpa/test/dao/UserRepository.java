package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	//for custom method
//	so i am explaining findByName
//	find called introducer
//	ByName or ById or any with By-- called criteria
//	and Sting name name is our property
//	you can check querry method
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
}
