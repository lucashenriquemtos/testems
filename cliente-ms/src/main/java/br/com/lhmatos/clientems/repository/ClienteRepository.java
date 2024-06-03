package br.com.lhmatos.clientems.repository;

import br.com.lhmatos.clientems.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
