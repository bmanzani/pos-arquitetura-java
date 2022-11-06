package br.edu.infnet.appaventureiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.service.ArmaService;

@Controller
public class ArmaController {
	
	@Autowired
	private ArmaService armaService;
	
	@GetMapping(value = "/arma/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem",armaService.obterLista());
		return "arma/lista";
	}
	
	@GetMapping(value = "/arma/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		armaService.excluir(id);

		return "redirect:/arma/lista";
	}
}
