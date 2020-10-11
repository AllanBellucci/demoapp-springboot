package br.com.application.demoapp.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.application.demoapp.entities.Order;
import br.com.application.demoapp.entities.User;
import br.com.application.demoapp.repositories.OrderRepository;
import br.com.application.demoapp.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User(null, "Allan", "9999-9999", "email@email.com", "123456", null);
		User user2 = new User(null, "Joao", "8888-8888", "email1@email.com", "123456", null);

		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), user2);
	
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1,order2));
	}

}
