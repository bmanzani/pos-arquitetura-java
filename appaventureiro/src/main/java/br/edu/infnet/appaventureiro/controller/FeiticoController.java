package br.edu.infnet.appaventureiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appaventureiro.model.domain.Feitico;

@Controller
public class FeiticoController {
	
	private static Map<Integer, Feitico> mapa = new HashMap<Integer, Feitico>();	
	private static Integer id = 1;
	
	public static void incluir(Feitico feitico) {
		feitico.setId(id++);
		mapa.put(feitico.getId(), feitico);

		System.out.println("> " + feitico);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Feitico> obterLista(){
		return mapa.values();
	}

	@GetMapping(value = "/feitico/lista")
	public String TelaLista(Model model) {		
		model.addAttribute("listagem", obterLista());
		return "feitico/lista";
	}
	
	@GetMapping(value = "/feitico/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/feitico/lista";
	}
}
