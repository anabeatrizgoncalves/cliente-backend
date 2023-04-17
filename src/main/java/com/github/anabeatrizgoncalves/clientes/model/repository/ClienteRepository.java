package com.github.anabeatrizgoncalves.clientes.model.repository;

import com.github.anabeatrizgoncalves.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
