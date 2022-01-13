package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	//Deriver Querry Method/Custom Finder Method
//	so i am explaining findByName
//	find called introducer
//	ByName or ById or any with By-- called criteria
//	and Sting name name is our property
//	you can check querry method
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name,String city);
//	Name will be any field in the specific table
	//Startingwith
//	findByNameStartingWith(String prefix)
	//endingwith
//	findByNameEndingWith(String suffix)
//	Containing
//	findByNameContaining(String words)
//	Like operator
//	findByNameLike(String likePatter)
//	Comparison operator
//	findByAgeLessThan(int age)
//	findByAgeGreaterThanEqual(int age)	
//	findByAgeIn(Collection<Integer> ages)
//	findByNameOrderByName(String name)
//	JPQL/  Hibernate queerry
	@Query("select u FROM User u")
	public List<User> getAllUser();
	
//	@Query("select u FROM User u where u.name =:n")
//	public List<User> getUserByName(@Param("n") String name);
	
//	for multiple parameter
	@Query("select u FROM User u where u.name =:n and u.city=:c")
	public List<User> getUserByNameAndCity(@Param("n") String name, @Param("c")String city );
	
//	SO now looking for native Query
	@Query(value="select * from user",nativeQuery=true)
	public List<User> getUsers();
	
	
	
}
