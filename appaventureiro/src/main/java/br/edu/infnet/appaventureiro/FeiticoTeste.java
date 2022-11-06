package br.edu.infnet.appaventureiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Feitico;
import br.edu.infnet.appaventureiro.model.service.FeiticoService;

@Component
public class FeiticoTeste implements ApplicationRunner {

	@Autowired
	private FeiticoService feiticoService;
	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Feitiços ##");

		Feitico feitico1 = new Feitico();
		feitico1.setCodigo(1);
		feitico1.setNome("Seta de Gelo");
		feitico1.setValor(200);
		feitico1.setLevel(10);
		feitico1.isConsumivel();
		feitico1.setElemento("Gelo");
		feitico1.setQtdemana(20);
		feitico1.setClasse("Todas");
		feiticoService.incluir(feitico1);

		Feitico feitico2 = new Feitico();
		feitico2.setCodigo(2);
		feitico2.setNome("Bola de Fogo");
		feitico2.setValor(200);
		feitico2.setLevel(15);
		feitico2.isConsumivel();
		feitico2.setElemento("Fogo");
		feitico2.setQtdemana(5);
		feitico2.setClasse("Todas");
		feiticoService.incluir(feitico2);

		Feitico feitico3 = new Feitico();
		feitico3.setCodigo(3);
		feitico3.setNome("Rio de Lava");
		feitico3.setValor(20000);
		feitico3.setLevel(45);
		feitico3.setConsumivel(false);
		feitico3.setElemento("Fogo");
		feitico3.setQtdemana(20);
		feitico3.setClasse("Mago");
		feiticoService.incluir(feitico3);
	}
}
