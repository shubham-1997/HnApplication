package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.User;
import com.example.repository.UserRepository;


@SpringBootApplication
@EnableJpaRepositories()
@ComponentScan(basePackages = {"com.example"})
public class HnApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HnApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		this.userRepository.save(new User("Ramesh"));
//		this.userRepository.save(new User("Tom"));
//		this.userRepository.save(new User("Tony"));
	}
}
