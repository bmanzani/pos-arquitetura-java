package br.edu.infnet.appaventureiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Arma;

@Component
public class ArmaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Arma arma1 =  new Arma();
		arma1.ranged = true;
		arma1.peso = 5;
		arma1.elemento = "Fogo";
		arma1.tipo = "Arco";		
		
		Arma arma2 = new Arma();
		arma2.ranged = false;
		arma2.peso = 2;
		arma2.elemento = "Gelo";
		arma2.tipo = "Adaga";
		
		Arma arma3 = new Arma();
		arma3.ranged = true;
		arma3.peso = 4;
		arma3.elemento = "Veneno";
		arma3.tipo = "Besta";
		
		System.out.println("Arma - "+ arma1);
		System.out.println("Arma - "+ arma2);
		System.out.println("Arma - "+ arma3);
	}
}
