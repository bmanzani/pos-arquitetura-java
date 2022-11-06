package br.edu.infnet.appaventureiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.domain.Armadura;

@Controller
public class ArmaduraController {

	private static Map<Integer, Armadura> mapa = new HashMap<Integer, Armadura>();
	private static Integer id = 1;

	public static void incluir(Armadura armadura) {
		armadura.setId(id++);
		mapa.put(armadura.getId(), armadura);

		System.out.println("> " + armadura);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Armadura> obterLista() {
		return mapa.values();
	}

	@GetMapping(value = "/armadura/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "armadura/lista";
	}

	@GetMapping(value = "/armadura/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/armadura/lista";
	}
}