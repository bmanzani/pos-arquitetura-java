package br.edu.infnet.appaventureiro.controller;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import br.edu.infnet.appaventureiro.model.domain.Equipamento;

@Controller
public class EquipamentoController {

	private static Map<Integer, Equipamento> mapa = new HashMap<Integer, Equipamento>();
	private static Integer id = 1;

	public static void incluir(Equipamento equipamento) {
		equipamento.setId(id++);
		mapa.put(equipamento.getId(), equipamento);

		System.out.println("> " + equipamento);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Equipamento> obterLista() {
		return mapa.values();
	}

	@GetMapping(value = "/equipamento/lista")
	public String TelaLista(Model model) {
		model.addAttribute("listagem", obterLista());
		return "equipamento/lista";
	}

	@GetMapping(value = "/equipamento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/equipamento/lista";
	}
}
