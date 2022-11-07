package br.edu.infnet.appaventureiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;
import br.edu.infnet.appaventureiro.model.domain.Usuario;
import br.edu.infnet.appaventureiro.model.service.AventureiroService;

@Controller
public class AventureiroController {

	@Autowired
	private AventureiroService aventureiroService;

	@GetMapping(value = "/aventureiro/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", aventureiroService.obterLista());
		return "aventureiro/lista";
	}

	@GetMapping(value = "/aventureiro")
	public String telaCadastro() {
		return "aventureiro/cadastro";
	}

	@PostMapping(value = "/aventureiro/incluir")
	public String incluir(Aventureiro aventureiro, @SessionAttribute("user") Usuario usuario) {
		aventureiro.setUsuario(usuario);

		aventureiroService.incluir(aventureiro);

		return "redirect:/aventureiro/lista";
	}

	@GetMapping(value = "/aventureiro/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		aventureiroService.excluir(id);

		return "redirect:/aventureiro/lista";
	}
}
