package br.com.lhmatos.pedidoms.service;

import br.com.lhmatos.pedidoms.client.ClienteFeignClient;
import br.com.lhmatos.pedidoms.dto.PedidoRecordDTO;
import br.com.lhmatos.pedidoms.model.Pedido;
import br.com.lhmatos.pedidoms.repository.PedidoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private ObjectMapper objectMapper;

	@Transactional
	public PedidoRecordDTO criarPedido(PedidoRecordDTO pedidoDTO) {
		Pedido pedido = objectMapper.convertValue(pedidoDTO, Pedido.class);
		pedido = pedidoRepository.save(pedido);
		return objectMapper.convertValue(pedido, PedidoRecordDTO.class);
	}

	public PedidoRecordDTO buscarPedidoPorId(Long id) {
		Pedido pedido = pedidoRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("Pedido não encontrado com o ID: " + id));
		return objectMapper.convertValue(pedido, PedidoRecordDTO.class);
	}
}