package br.com.application.demoapp.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.application.demoapp.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user  = new User(1L, "Allan", "9999-9999", "email@email.com", "123456");
		return ResponseEntity.ok().body(user);
	}
}
