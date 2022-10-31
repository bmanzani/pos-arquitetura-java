package br.edu.infnet.appaventureiro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appaventureiro.model.domain.Armadura;

@Controller
public class ArmaduraController {

	@GetMapping(value = "/armadura/lista")
	public String TelaLista(Model model) {
		Armadura armadura1 = new Armadura();
		armadura1.setCodigo(1);
		armadura1.setNome("Armadura de Couro");
		armadura1.setValor(100);
		armadura1.setLevel(10);
		armadura1.setDefesa(40);
		armadura1.isEncantada();
		armadura1.setRecomendacoes("Defesa Física");
		
		Armadura armadura2 = new Armadura();
		armadura2.setCodigo(2);
		armadura2.setNome("Armadura de Aço");
		armadura2.setValor(200);
		armadura2.setLevel(20);
		armadura2.setDefesa(80);
		armadura2.setEncantada(false);
		armadura2.setRecomendacoes("Defesa Física");
		
		Armadura armadura3 = new Armadura();
		armadura3.setCodigo(3);
		armadura3.setNome("Armadura de Pele de Dragão");
		armadura3.setValor(100000);
		armadura3.setLevel(60);
		armadura3.setDefesa(200);
		armadura3.isEncantada();
		armadura3.setRecomendacoes("Defesa Híbrida");
		
		List<Armadura> Armaduras = new ArrayList<Armadura>();
		Armaduras.add(armadura1);
		Armaduras.add(armadura2);
		Armaduras.add(armadura3);
		
		model.addAttribute("listagem",Armaduras);
		return "armadura/lista";
	}
}
