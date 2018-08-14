package com.ons.school.web.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@ComponentScan({"com.ons.school.web","com.ons.school.data"})
@EnableCouchbaseRepositories(basePackages="com.ons.school.data.couchbase.repository")
//@EntityScan(basePackages="com.example.srdata.entity")
public class SrwebApplication {


	public static void main(String[] args) {
		SpringApplication.run(SrwebApplication.class, args);
	}

/*	@Override
	public void run(String... args) throws Exception {
	//	this.userRepository.deleteAll();
		UserEntity user = saveUser();
		System.out.println(this.userRepository.findById(user.getId()));
	}

	private UserEntity saveUser() {
		UserEntity user = new UserEntity();
		user.setId(UUID.randomUUID().toString());
		user.setFirstName("Alice");
		user.setLastName("Smith");
		return this.userRepository.save(user);
	}*/

}
