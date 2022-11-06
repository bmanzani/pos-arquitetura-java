package br.edu.infnet.appaventureiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.service.AventureiroService;

@Controller
public class AventureiroController {

	@Autowired
	private AventureiroService aventureiroService;

	@GetMapping(value = "/aventureiro/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem", aventureiroService.obterLista());
		return "aventureiro/lista";
	}

	@GetMapping(value = "/aventureiro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		aventureiroService.excluir(id);

		return "redirect:/aventureiro/lista";
	}
}
