package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.clients.IAventureiroClient;
import br.edu.infnet.appaventureiro.model.clients.IEnderecoClient;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;
import br.edu.infnet.appaventureiro.model.domain.Endereco;
import br.edu.infnet.appaventureiro.model.domain.Usuario;

@Service
public class AventureiroService {

	@Autowired
	private IEnderecoClient enderecoClient;
	@Autowired
	private IAventureiroClient aventureiroClient;

	public void incluir(Aventureiro aventureiro) {
		aventureiroClient.incluir(aventureiro);
	}

	public void excluir(Integer id) {
		aventureiroClient.excluir(id);
	}

	public Collection<Aventureiro> obterLista() {
		return aventureiroClient.obterLista();
	}

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
	
	public List<Aventureiro> obterLista(Usuario usuario) {
		return (List<Aventureiro>) aventureiroClient.obterLista(usuario.getId());
	}
}
