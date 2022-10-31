package br.edu.infnet.appaventureiro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appaventureiro.model.domain.Feitico;

@Controller
public class FeiticoController {

	@GetMapping(value = "/feitico/lista")
	public String TelaLista(Model model) {		
		
		Feitico feitico1 =  new Feitico();
		feitico1.setCodigo(1);
		feitico1.setNome("Seta de Gelo");
		feitico1.setValor(200);
		feitico1.setLevel(10);
		feitico1.isConsumivel();
		feitico1.setElemento("Gelo");
		feitico1.setQtdemana(20);
		feitico1.setClasse("Todas");
		
		Feitico feitico2 =  new Feitico();
		feitico2.setCodigo(2);
		feitico2.setNome("Bola de Fogo");
		feitico2.setValor(200);
		feitico2.setLevel(15);
		feitico2.isConsumivel();
		feitico2.setElemento("Fogo");
		feitico2.setQtdemana(5);
		feitico2.setClasse("Todas");
		
		Feitico feitico3 =  new Feitico();
		feitico3.setCodigo(3);
		feitico3.setNome("Rio de Lava");
		feitico3.setValor(20000);
		feitico3.setLevel(45);
		feitico3.setConsumivel(false);
		feitico3.setElemento("Fogo");
		feitico3.setQtdemana(20);
		feitico3.setClasse("Mago");
		
		
		List<Feitico> Feiticos = new ArrayList<Feitico>();
		Feiticos.add(feitico1);
		Feiticos.add(feitico2);
		Feiticos.add(feitico3);
		
		model.addAttribute("listagem",Feiticos);	
		return "feitico/lista";
	}
}
