package br.edu.infnet.appaventureiro;
import java.time.LocalDateTime;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Pedido;

@Component
public class PedidoTeste implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Pedido pedido1 = new Pedido();
		
		pedido1.data = LocalDateTime.now();
		pedido1.descricao = "pedido dos magos";
		pedido1.encomenda = true;
		System.out.println("Pedido - " + pedido1);
		
	}
}