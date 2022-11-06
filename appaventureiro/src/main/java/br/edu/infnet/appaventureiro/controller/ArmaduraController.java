package br.edu.infnet.appaventureiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.service.ArmaduraService;

@Controller
public class ArmaduraController {

	@Autowired
	private ArmaduraService armaduraService;
	
	@GetMapping(value = "/armadura/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem", armaduraService.obterLista());
		return "armadura/lista";
	}

	@GetMapping(value = "/armadura/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		armaduraService.excluir(id);

		return "redirect:/armadura/lista";
	}
}