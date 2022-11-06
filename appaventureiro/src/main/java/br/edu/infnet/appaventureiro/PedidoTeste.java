package br.edu.infnet.appaventureiro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.controller.PedidoController;
import br.edu.infnet.appaventureiro.model.domain.Arma;
import br.edu.infnet.appaventureiro.model.domain.Armadura;
import br.edu.infnet.appaventureiro.model.domain.Aventureiro;
import br.edu.infnet.appaventureiro.model.domain.Equipamento;
import br.edu.infnet.appaventureiro.model.domain.Feitico;
import br.edu.infnet.appaventureiro.model.domain.Pedido;

@Component
public class PedidoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Pedidos ##");

		Aventureiro aventureiro1 = new Aventureiro();
		aventureiro1.setLevel(60);
		;
		aventureiro1.setClasse("Guerreiro");
		aventureiro1.setNome("Ragnir");

		Aventureiro aventureiro3 = new Aventureiro();
		aventureiro3.setLevel(60);
		;
		aventureiro3.setClasse("Caçador");
		aventureiro3.setNome("Siegfried");
		System.out.println("> - " + aventureiro3);

		Armadura armadura1 = new Armadura();
		armadura1.setCodigo(1);
		armadura1.setNome("Armadura de Couro");
		armadura1.setValor(100);
		armadura1.setLevel(10);
		armadura1.setDefesa(40);
		armadura1.isEncantada();
		armadura1.setRecomendacoes("Defesa Física");

		Arma arma1 = new Arma();
		arma1.setCodigo(2);
		arma1.setNome("Machado do Ferreiro");
		arma1.setValor(200);
		arma1.setLevel(20);
		arma1.setRanged(false);
		arma1.setPeso(5);
		arma1.setElemento("Fogo");
		arma1.setTipo("Machado");

		Feitico feitico3 = new Feitico();
		feitico3.setCodigo(3);
		feitico3.setNome("Rio de Lava");
		feitico3.setValor(20000);
		feitico3.setLevel(45);
		feitico3.setConsumivel(false);
		feitico3.setElemento("Fogo");
		feitico3.setQtdemana(20);
		feitico3.setClasse("Mago");

		List<Equipamento> equipamentosPrimeiroPedido = new ArrayList<Equipamento>();
		equipamentosPrimeiroPedido.add(feitico3);
		equipamentosPrimeiroPedido.add(arma1);

		List<Equipamento> equipamentosDemaisPedido = new ArrayList<Equipamento>();
		equipamentosDemaisPedido.add(feitico3);
		equipamentosDemaisPedido.add(arma1);
		equipamentosDemaisPedido.add(armadura1);

		Pedido pedido1 = new Pedido();
		pedido1.setDescricao("pedido da escola de magos");
		pedido1.isEncomenda();
		pedido1.setAventureiro(aventureiro1);
		pedido1.setEquipamentos(equipamentosPrimeiroPedido);
		PedidoController.incluir(pedido1);

		Pedido pedido2 = new Pedido();
		pedido2.setDescricao("Solicitação imediata de um aventureiro desconhecido");
		pedido2.setEncomenda(false);
		pedido2.setAventureiro(aventureiro1);
		pedido2.setEquipamentos(equipamentosDemaisPedido);
		PedidoController.incluir(pedido2);

		Pedido pedido3 = new Pedido();
		pedido3.setDescricao("Encomenda ao Sr. Siegfried");
		pedido3.isEncomenda();
		pedido3.setAventureiro(aventureiro3);
		pedido3.setEquipamentos(equipamentosDemaisPedido);
	}
}