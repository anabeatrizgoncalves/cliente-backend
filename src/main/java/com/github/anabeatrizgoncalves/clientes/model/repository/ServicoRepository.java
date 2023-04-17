package com.github.anabeatrizgoncalves.clientes.model.repository;

import com.github.anabeatrizgoncalves.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer > {
}
