package br.com.application.demoapp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.application.demoapp.entities.User;
import br.com.application.demoapp.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Allan", "9999-9999", "email@email.com", "123456");
		User user2 = new User(null, "Joao", "8888-8888", "email1@email.com", "123456");
		
		userRepository.saveAll(Arrays.asList(user1,user2));
		
	}
	
}
