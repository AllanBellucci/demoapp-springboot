package br.com.application.demoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.application.demoapp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
