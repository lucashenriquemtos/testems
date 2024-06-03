package br.com.lhmatos.pedidoms.client;

import br.com.lhmatos.pedidoms.api.ClienteRecordDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "cliente-ms", url = "${cliente-ms.url}") // Nome do serviço de cliente registrado no Eureka ou diretamente a URL do serviço
public interface ClienteFeignClient {

	@GetMapping("/clientes/{id}")
	ClienteRecordDTO buscarClientePorId(@PathVariable("id") Long id);
}