package br.edu.infnet.appaventureiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appaventureiro.model.domain.Aventureiro;

@Controller
public class AventureiroController {
	
	private static Map<Integer, Aventureiro> mapa = new HashMap<Integer, Aventureiro>();	
	private static Integer id = 1;

	public static void incluir(Aventureiro aventureiro) {
		aventureiro.setId(id++);
		mapa.put(aventureiro.getId(), aventureiro);

		System.out.println("> " + aventureiro);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Aventureiro> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/aventureiro/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "aventureiro/lista";
	}
	
	@GetMapping(value = "/aventureiro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/aventureiro/lista";
	}
}
