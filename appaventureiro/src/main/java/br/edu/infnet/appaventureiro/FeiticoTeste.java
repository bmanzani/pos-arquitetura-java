package br.edu.infnet.appaventureiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Feitico;

@Component
public class FeiticoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Feitico feitico1 =  new Feitico();
		
		feitico1.consumivel = true;
		feitico1.elemento = "gelo";
		feitico1.qtdemana = 20;
		feitico1.classe = "todas";
		System.out.println("Feitiço - " + feitico1);
	}
}
