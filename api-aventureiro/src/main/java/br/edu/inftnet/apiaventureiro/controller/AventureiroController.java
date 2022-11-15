package br.edu.inftnet.apiaventureiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.inftnet.apiaventureiro.model.domain.Aventureiro;
import br.edu.inftnet.apiaventureiro.model.service.AventureiroService;

@RestController
@RequestMapping("/api/aventureiro")
public class AventureiroController {

	@Autowired
	private AventureiroService aventureiroService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Aventureiro aventureiro) {
		aventureiroService.incluir(aventureiro);
	}

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		aventureiroService.excluir(id);
	}

	@GetMapping(value = "/listar")
	public List<Aventureiro> obterLista(){
		return aventureiroService.obterLista();
	}
	
	@GetMapping(value = "/listarporid")
	public List<Aventureiro> obterLista(@RequestParam Integer id){
		return aventureiroService.obterListaPorID(id);
	}
}
