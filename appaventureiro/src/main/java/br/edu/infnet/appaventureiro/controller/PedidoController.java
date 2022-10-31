package br.edu.infnet.appaventureiro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidoController {

	@GetMapping(value = "/pedido/lista")
	public String TelaLista() {
		return "pedido/lista";
	}
}
