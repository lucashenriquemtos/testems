package br.com.lhmatos.pedidoms.controller;

import br.com.lhmatos.pedidoms.dto.PedidoRecordDTO;
import br.com.lhmatos.pedidoms.model.Pedido;
import br.com.lhmatos.pedidoms.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@PostMapping
	public ResponseEntity<PedidoRecordDTO> criarPedido(@RequestBody @Valid PedidoRecordDTO pedido) {
		try {
			PedidoRecordDTO pedidoCriado = pedidoService.criarPedido(pedido);
			return ResponseEntity.status(HttpStatus.CREATED).body(pedidoCriado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	@GetMapping("/{id}")
	public ResponseEntity<PedidoRecordDTO> buscarPedidoPorId(@PathVariable Long id) {
		try {
			PedidoRecordDTO pedido = pedidoService.buscarPedidoPorId(id);
			return ResponseEntity.ok(pedido);
		} catch (NoSuchElementException e) {
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
