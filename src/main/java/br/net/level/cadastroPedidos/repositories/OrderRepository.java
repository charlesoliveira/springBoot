package br.net.level.cadastroPedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.level.cadastroPedidos.entities.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {

}
