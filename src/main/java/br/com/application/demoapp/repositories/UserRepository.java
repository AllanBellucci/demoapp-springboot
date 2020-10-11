package br.com.application.demoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.application.demoapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
