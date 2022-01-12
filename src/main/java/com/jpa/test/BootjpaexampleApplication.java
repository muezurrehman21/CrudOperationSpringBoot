package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;


@SpringBootApplication
public class BootjpaexampleApplication {


	public static void main(String[] args) {
	ApplicationContext context = 	SpringApplication.run(BootjpaexampleApplication.class, args);
	
	UserRepository userRepository = context.getBean(UserRepository.class);
		
//		User user = new User();
//		user.setName("muez");
//		user.setCity("Islamabad");
//		user.setStatus("i am  a java developer");
		//for single object
//		User user1 = userRepository.save(user);
//	System.out.println(user1);
//	User user1 = new User();
//	user1.setName("muez");
//	user1.setCity("Islamabad");
//	user1.setStatus("i am  a java developer");
//	
//		User user2 = new User();
//		user2.setName("muez");
//		user2.setCity("Islamabad");
//		user2.setStatus("i am  a java developer");
//		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result =userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
	
	//update
//	Optional<User> optional = userRepository.findById(2);
//	
//	User user = optional.get();
//	
//	user.setName("Devomech");
//	
//	userRepository.save(user);
//	System.out.println(user);
	
//	get the data

//	Iterable<User> itr=userRepository.findAll();
//	old way
//	Iterator<User> iterator = itr.iterator();
//	while(iterator.hasNext()) {
//		User user = iterator.next();
//		System.out.println(user);
//	}
	
//	itr.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			// TODO Auto-generated method stub
//			System.out.println(t);
//			
//		}
//		
//	});
	
//	easy
//	itr.forEach(user->{System.out.println(user);});
	
//	Delete the user Element
	userRepository.deleteById(3);
	System.out.println("deleted");
	}

}