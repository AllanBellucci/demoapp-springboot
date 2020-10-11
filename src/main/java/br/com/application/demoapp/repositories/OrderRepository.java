package br.com.application.demoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.application.demoapp.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
