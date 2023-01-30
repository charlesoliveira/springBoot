package br.net.level.cadastroPedidos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.net.level.cadastroPedidos.entities.Users;
import br.net.level.cadastroPedidos.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<Users> findAll() {
		return repository.findAll();
	}

	public Users findById(Long id) {
		Optional<Users> obj = repository.findById(id);
		return obj.get();
		
	}
}
