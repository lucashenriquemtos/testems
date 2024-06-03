package br.com.lhmatos.pedidoms.dto;

import br.com.lhmatos.pedidoms.model.Produto;

import java.io.Serializable;

/**
 * DTO for {@link Produto}
 */
public record ProdutoRecordDTO(Long id, String nome, double preco) implements Serializable {
}