package br.edu.infnet.appaventureiro.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.edu.infnet.appaventureiro.model.domain.Aventureiro;

@Controller
public class AventureiroController {

	@GetMapping(value = "/aventureiro/lista")
	public String TelaLista(Model model) {
		
		Aventureiro aventureiro1 = new Aventureiro();
		aventureiro1.setLevel(60);;
		aventureiro1.setClasse("Guerreiro");
		aventureiro1.setNome("Ragnir");
		
		Aventureiro aventureiro2 = new Aventureiro();
		aventureiro2.setLevel(60);;
		aventureiro2.setClasse("Mago");
		aventureiro2.setNome("Freij");
		
		Aventureiro aventureiro3 = new Aventureiro();
		aventureiro3.setLevel(60);;
		aventureiro3.setClasse("Caçador");
		aventureiro3.setNome("Siegfried");
		
		List<Aventureiro> Aventureiros = new ArrayList<Aventureiro>();
		Aventureiros.add(aventureiro1);
		Aventureiros.add(aventureiro2);
		Aventureiros.add(aventureiro3);
		
		model.addAttribute("listagem",Aventureiros);
		return "aventureiro/lista";
	}
}
