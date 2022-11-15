package br.edu.infnet.appaventureiro.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;

@FeignClient(url = "localhost:8082/api/aventureiro", name = "aventureiroClient")
public interface IAventureiroClient {
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Aventureiro aventureiro);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/listar")
	public List<Aventureiro> obterLista();
	
	@GetMapping(value = "/listar")
	public List<Aventureiro> obterLista(@RequestParam Integer id);

}
