package br.edu.infnet.appaventureiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;

@Component
public class AventureiroTeste implements ApplicationRunner{
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Aventureiro aventureiro1 = new Aventureiro();
		
		aventureiro1.level = 60;
		aventureiro1.classe = "Guerreiro";
		aventureiro1.nome = "Ragnir";
		
		System.out.println("Aventureiro - " + aventureiro1);
	}
}
