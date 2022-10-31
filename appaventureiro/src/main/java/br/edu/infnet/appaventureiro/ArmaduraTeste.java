package br.edu.infnet.appaventureiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Armadura;

@Component
public class ArmaduraTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Armadura armadura1 = new Armadura();
		
		armadura1.defesa = 40;
		armadura1.encantada = true;
		armadura1.recomendacoes = "defesa física";
		
		System.out.println("Armadura - " + armadura1);
	}
}
