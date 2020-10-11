package br.com.application.demoapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.application.demoapp.entities.Order;
import br.com.application.demoapp.repositories.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository userRepository;

	public List<Order> findAll() {
		return userRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = userRepository.findById(id);
		return user.get();
	}
	

}
