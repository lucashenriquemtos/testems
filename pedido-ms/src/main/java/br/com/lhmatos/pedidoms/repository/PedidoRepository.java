package br.com.lhmatos.pedidoms.repository;

import br.com.lhmatos.pedidoms.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}