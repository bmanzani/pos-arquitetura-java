package br.edu.infnet.appaventureiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipamentoController {

	@GetMapping(value = "/equipamento/lista")
	public String TelaLista() {
	
		return "equipamento/lista";
	}
}
