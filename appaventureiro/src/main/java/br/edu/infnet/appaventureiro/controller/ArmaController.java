package br.edu.infnet.appaventureiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.domain.Arma;

@Controller
public class ArmaController {
	
	private static Map<Integer, Arma> mapa = new HashMap<Integer, Arma>();	
	private static Integer id = 1;
	
	public static void incluir(Arma arma) {
		arma.setId(id++);
		mapa.put(arma.getId(), arma);

		System.out.println("> " + arma);
	}
	
	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Arma> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/arma/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem",obterLista());
		return "arma/lista";
	}
	
	@GetMapping(value = "/arma/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/arma/lista";
	}
}
