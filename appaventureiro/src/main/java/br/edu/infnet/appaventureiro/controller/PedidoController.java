package br.edu.infnet.appaventureiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appaventureiro.model.domain.Pedido;
import br.edu.infnet.appaventureiro.model.domain.Usuario;
import br.edu.infnet.appaventureiro.model.service.AventureiroService;
import br.edu.infnet.appaventureiro.model.service.EquipamentoService;
import br.edu.infnet.appaventureiro.model.service.PedidoService;

@Controller
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private AventureiroService aventureiroService;
	@Autowired
	private EquipamentoService equipamentoService;
	
	@GetMapping(value = "/pedido")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("aventureiros", aventureiroService.obterLista(usuario));

		model.addAttribute("equipamentos", equipamentoService.obterLista(usuario));
		
		return "pedido/cadastro";
	}
	
	@GetMapping(value = "/pedido/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", pedidoService.obterLista(usuario));

		return "pedido/lista";
	}
	
	@PostMapping(value = "/pedido/incluir")
	public String incluir(Pedido pedido, @SessionAttribute("user") Usuario usuario) {
		
		System.out.println("Aventureiros: " + pedido.getAventureiro());		
		System.out.println("Produtos: " + pedido.getEquipamentos());
		
		pedido.setUsuario(usuario);
		
		pedidoService.incluir(pedido);
		
		return "redirect:/pedido/lista";
	}
	
	@GetMapping(value = "/pedido/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		pedidoService.excluir(id);
		
		return "redirect:/pedido/lista";
	}

}
