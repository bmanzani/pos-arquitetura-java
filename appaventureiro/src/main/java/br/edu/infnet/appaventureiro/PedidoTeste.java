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
		
		System.out.println("## Cadastramento de Pedidos ##");
		
		Pedido pedido1 = new Pedido();
		pedido1.setData(LocalDateTime.now());
		pedido1.setDescricao("pedido da escola de magos");
		pedido1.isEncomenda();
		System.out.println("> - " + pedido1);

		Pedido pedido2 = new Pedido();
		pedido2.setData(LocalDateTime.now());
		pedido2.setDescricao("Solicitação imediata de um aventureiro desconhecido");
		pedido2.setEncomenda(false);
		System.out.println("> - " + pedido2);
		
		Pedido pedido3 = new Pedido();
		pedido3.setData(LocalDateTime.now());
		pedido3.setDescricao("Encomenda ao Sr. Siegfried");
		pedido3.isEncomenda();
		System.out.println("> - " + pedido3);
	}
}