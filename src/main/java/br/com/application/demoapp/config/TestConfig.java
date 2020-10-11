package br.com.application.demoapp.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.application.demoapp.entities.Category;
import br.com.application.demoapp.entities.Order;
import br.com.application.demoapp.entities.Product;
import br.com.application.demoapp.entities.User;
import br.com.application.demoapp.entities.enuns.OrderStatus;
import br.com.application.demoapp.repositories.CategoryRepository;
import br.com.application.demoapp.repositories.OrderRepository;
import br.com.application.demoapp.repositories.ProductRepository;
import br.com.application.demoapp.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		Category category1  = new Category(null, "shoes");
		Category category2  = new Category(null, "clothes");
		
		Product p1 = new Product(null, "Nike", "dvsdcd dvdvdvdv", 200.00, ""); 
		p1.getCategories().add(category1);
		Product p2 = new Product(null, "Adidas", "dvsdcd dvdvdvdv", 300.00, "");
		p2.getCategories().add(category1);
		Product p3 = new Product(null, "Puma", "dvsdcd dvdvdvdv", 100.00, ""); 
		p3.getCategories().add(category1);
		Product p4 = new Product(null, "Asics", "dvsdcd dvdvdvdv", 120.00, ""); 
		p4.getCategories().add(category1);
		Product p5 = new Product(null, "Shirt", "dvsdcd dvdvdvdv", 50.00, "");
		p5.getCategories().add(category2);
		Product p6 = new Product(null, "Skirt", "dvsdcd dvdvdvdv", 40.00, ""); 
		p6.getCategories().add(category2);
		
		User user1 = new User(null, "Allan", "9999-9999", "email@email.com", "123456");
		User user2 = new User(null, "Joao", "8888-8888", "email1@email.com", "123456");

		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, user1);
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.SHIPPED, user2);
	
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1,order2));
		categoryRepository.saveAll(Arrays.asList(category1,category2));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6));
	}

}
