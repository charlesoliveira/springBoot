package br.net.level.cadastroPedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.level.cadastroPedidos.entities.Orders;
import br.net.level.cadastroPedidos.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Orders>> findAll() {
		//Order u = new Order(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		
		List<Orders> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Orders> findById(@PathVariable Long id) {
		Orders obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
