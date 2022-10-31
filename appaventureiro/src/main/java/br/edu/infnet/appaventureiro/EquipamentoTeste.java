package br.edu.infnet.appaventureiro;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Equipamento;

@Component
public class EquipamentoTeste implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Equipamento equip1 = new Equipamento();
		equip1.codigo = 1;
		equip1.nome = "Adaga de Iniciante";
		equip1.level = 5;
		equip1.valor = 55;
		
		System.out.println("Equipamento - " + equip1);		
	}
}
