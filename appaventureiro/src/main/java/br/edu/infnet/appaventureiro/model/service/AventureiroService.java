package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;
import br.edu.infnet.appaventureiro.model.repository.AventureiroRepository;

@Service
public class AventureiroService {

	@Autowired
	private AventureiroRepository aventureiroRepository;

	public void incluir(Aventureiro aventureiro) {
		aventureiroRepository.save(aventureiro);
	}

	public void excluir(Integer id) {
		aventureiroRepository.deleteById(id);
	}

	public Collection<Aventureiro> obterLista() {
		return (Collection<Aventureiro>) aventureiroRepository.findAll();
	}
}
