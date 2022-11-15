package br.edu.infnet.appaventureiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Armadura;
import br.edu.infnet.appaventureiro.model.service.ArmaduraService;

@Order(4)
@Component
public class ArmaduraTeste implements ApplicationRunner {

	@Autowired
	private ArmaduraService armaduraService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Armaduras ##");

		Armadura armadura1 = new Armadura();
		armadura1.setCodigo(1);
		armadura1.setNome("Armadura de Couro");
		armadura1.setValor(100);
		armadura1.setLevel(10);
		armadura1.setDefesa(40);
		armadura1.isEncantada();
		armadura1.setRecomendacoes("Defesa Física");
		armaduraService.incluir(armadura1);

		Armadura armadura2 = new Armadura();
		armadura2.setCodigo(2);
		armadura2.setNome("Armadura de Aço");
		armadura2.setValor(200);
		armadura2.setLevel(20);
		armadura2.setDefesa(80);
		armadura2.setEncantada(false);
		armadura2.setRecomendacoes("Defesa Física");
		armaduraService.incluir(armadura2);

		Armadura armadura3 = new Armadura();
		armadura3.setCodigo(3);
		armadura3.setNome("Armadura de Pele de Dragão");
		armadura3.setValor(100000);
		armadura3.setLevel(60);
		armadura3.setDefesa(200);
		armadura3.isEncantada();
		armadura3.setRecomendacoes("Defesa Híbrida");
		armaduraService.incluir(armadura3);
	}
}
