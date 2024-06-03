package br.com.lhmatos.pedidoms.dto;

import br.com.lhmatos.pedidoms.model.Pedido;
import br.com.lhmatos.pedidoms.model.StatusPedido;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Pedido}
 */
public record PedidoRecordDTO(Long id, LocalDate dataPedido, StatusPedido status, Long idCliente) implements Serializable {
}