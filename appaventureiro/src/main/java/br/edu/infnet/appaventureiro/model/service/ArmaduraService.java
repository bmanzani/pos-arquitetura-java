package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.domain.Armadura;
import br.edu.infnet.appaventureiro.model.repository.ArmaduraRepository;

@Service
public class ArmaduraService {

	@Autowired
	private ArmaduraRepository armaduraRepository;

	public void incluir(Armadura armadura) {
		armaduraRepository.save(armadura);		
	}

	public void excluir(Integer id) {
		armaduraRepository.deleteById(id);
	}

	public Collection<Armadura> obterLista(){
		return (Collection<Armadura>) armaduraRepository.findAll();
	}
}
