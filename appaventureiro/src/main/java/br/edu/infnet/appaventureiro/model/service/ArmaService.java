package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.domain.Arma;
import br.edu.infnet.appaventureiro.model.repository.ArmaRepository;

@Service
public class ArmaService {

	@Autowired
	private ArmaRepository armaRepository;

	public void incluir(Arma arma) {
		armaRepository.save(arma);		
	}

	public void excluir(Integer id) {
		armaRepository.deleteById(id);
	}

	public Collection<Arma> obterLista(){
		return (Collection<Arma>) armaRepository.findAll();
	}
}