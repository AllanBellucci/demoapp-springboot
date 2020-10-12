package br.com.application.demoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.application.demoapp.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
