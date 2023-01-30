package br.net.level.cadastroPedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.level.cadastroPedidos.entities.Users;
import br.net.level.cadastroPedidos.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<Users>> findAll() {
		//User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		
		List<Users> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id) {
		Users obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
