package br.edu.inftnet.apiaventureiro.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.inftnet.apiaventureiro.model.domain.Aventureiro;
import br.edu.inftnet.apiaventureiro.model.repository.AventureiroRepository;

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

	public List<Aventureiro> obterLista() {
		return (List<Aventureiro>) aventureiroRepository.findAll();
	}
	
	public List<Aventureiro> obterListaPorID(Integer id){
		if(id==null)return (List<Aventureiro>) aventureiroRepository.findAll();
		return aventureiroRepository.obterListaPorID(id);
	}
}
