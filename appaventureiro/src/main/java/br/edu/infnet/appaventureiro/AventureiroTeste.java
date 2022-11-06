package br.edu.infnet.appaventureiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;
import br.edu.infnet.appaventureiro.model.service.AventureiroService;

@Component
public class AventureiroTeste implements ApplicationRunner {

	@Autowired
	private AventureiroService aventureiroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Aventureiros ##");

		Aventureiro aventureiro1 = new Aventureiro();
		aventureiro1.setLevel(60);
		;
		aventureiro1.setClasse("Guerreiro");
		aventureiro1.setNome("Ragnir");
		aventureiroService.incluir(aventureiro1);

		Aventureiro aventureiro2 = new Aventureiro();
		aventureiro2.setLevel(60);
		;
		aventureiro2.setClasse("Mago");
		aventureiro2.setNome("Freij");
		aventureiroService.incluir(aventureiro2);

		Aventureiro aventureiro3 = new Aventureiro();
		aventureiro3.setLevel(60);
		;
		aventureiro3.setClasse("Caçador");
		aventureiro3.setNome("Siegfried");
		aventureiroService.incluir(aventureiro3);
	}
}
