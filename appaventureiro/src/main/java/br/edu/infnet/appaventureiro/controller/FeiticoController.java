package br.edu.infnet.appaventureiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.service.FeiticoService;

@Controller
public class FeiticoController {
	
	@Autowired
	private FeiticoService feiticoService;
	
	@GetMapping(value = "/feitico/lista")
	public String TelaLista(Model model) {		
		model.addAttribute("listagem", feiticoService.obterLista());
		return "feitico/lista";
	}
	
	@GetMapping(value = "/feitico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		feiticoService.excluir(id);

		return "redirect:/feitico/lista";
	}
}
