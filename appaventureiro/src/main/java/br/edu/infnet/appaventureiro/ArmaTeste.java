package br.edu.infnet.appaventureiro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Arma;
import br.edu.infnet.appaventureiro.model.service.ArmaService;

@Order(5)
@Component
public class ArmaTeste implements ApplicationRunner {
	
	@Autowired
	private ArmaService armaService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Armas ##");
		
		Arma arma1 =  new Arma();
		arma1.setCodigo(2);
		arma1.setNome("Machado do Ferreiro");
		arma1.setValor(200);
		arma1.setLevel(20);
		arma1.setRanged(false);
		arma1.setPeso(5);
		arma1.setElemento("Fogo");
		arma1.setTipo("Machado");		
		armaService.incluir(arma1);
		
		Arma arma2 = new Arma();
		arma2.setCodigo(3);
		arma2.setNome("Arco de Madeira");
		arma2.setValor(100);
		arma2.setLevel(5);
		arma2.isRanged();
		arma2.setPeso(5);
		arma2.setElemento("Não Elemental");
		arma2.setTipo("Arco");	
		armaService.incluir(arma2);
		
		Arma arma3 = new Arma();
		arma3.setCodigo(3);
		arma3.setNome("Adaga de Ladino");
		arma3.setValor(50000);
		arma3.setLevel(60);
		arma3.setRanged(false);
		arma3.setPeso(2);
		arma3.setElemento("Veneno");
		arma3.setTipo("Adaga");	
		armaService.incluir(arma3);
	}
}
