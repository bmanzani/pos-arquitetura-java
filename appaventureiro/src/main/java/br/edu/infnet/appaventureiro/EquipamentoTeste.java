package br.edu.infnet.appaventureiro;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Armadura;
import br.edu.infnet.appaventureiro.model.domain.Feitico;
import br.edu.infnet.appaventureiro.controller.EquipamentoController;
import br.edu.infnet.appaventureiro.model.domain.Arma;

@Order(3)
@Component
public class EquipamentoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Equipamentos ##");

		Armadura armadura1 = new Armadura();
		armadura1.setCodigo(1);
		armadura1.setNome("Armadura de Couro");
		armadura1.setValor(100);
		armadura1.setLevel(10);
		armadura1.setDefesa(40);
		armadura1.isEncantada();
		armadura1.setRecomendacoes("Defesa Física");
		EquipamentoController.incluir(armadura1);

		Arma arma1 = new Arma();
		arma1.setCodigo(2);
		arma1.setNome("Machado do Ferreiro");
		arma1.setValor(200);
		arma1.setLevel(20);
		arma1.setRanged(false);
		arma1.setPeso(5);
		arma1.setElemento("Fogo");
		arma1.setTipo("Machado");
		EquipamentoController.incluir(arma1);

		Feitico feitico3 = new Feitico();
		feitico3.setCodigo(3);
		feitico3.setNome("Rio de Lava");
		feitico3.setValor(20000);
		feitico3.setLevel(45);
		feitico3.setConsumivel(false);
		feitico3.setElemento("Fogo");
		feitico3.setQtdemana(20);
		feitico3.setClasse("Mago");
		EquipamentoController.incluir(feitico3);
	}
}
