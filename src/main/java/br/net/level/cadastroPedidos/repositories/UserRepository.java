package br.net.level.cadastroPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.level.cadastroPedidos.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
