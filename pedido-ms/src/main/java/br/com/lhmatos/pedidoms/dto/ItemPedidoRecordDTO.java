package br.com.lhmatos.pedidoms.dto;

import br.com.lhmatos.pedidoms.model.ItemPedido;

import java.io.Serializable;

/**
 * DTO for {@link ItemPedido}
 */
public record ItemPedidoRecordDTO(Long id, int quantidade) implements Serializable {
}