package br.edu.infnet.appaventureiro.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import br.edu.infnet.appaventureiro.model.domain.Pedido;

@Controller
public class PedidoController {
	
	private static Map<Integer, Pedido> mapa = new HashMap<Integer, Pedido>();	
	private static Integer id = 1;
	
	public static void incluir(Pedido pedido) {
		pedido.setId(id++);
		mapa.put(pedido.getId(), pedido);

		System.out.println("> " + pedido);
	}

	public static void excluir(Integer id) {
		mapa.remove(id);
	}

	public static Collection<Pedido> obterLista(){
		return mapa.values();
	}
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model) {
		model.addAttribute("listagem", obterLista());

		return "pedido/lista";
	}

	@GetMapping(value = "/pedido/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		excluir(id);

		return "redirect:/pedido/lista";
	}
}
