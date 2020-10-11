package br.com.application.demoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.application.demoapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
