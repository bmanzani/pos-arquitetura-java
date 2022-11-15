package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.domain.Equipamento;
import br.edu.infnet.appaventureiro.model.domain.Usuario;
import br.edu.infnet.appaventureiro.model.repository.EquipamentoRepository;

@Service
public class EquipamentoService {

	@Autowired
	private EquipamentoRepository equipamentoRepository;

	public void incluir(Equipamento equipamento) {
		equipamentoRepository.save(equipamento);
	}
	
	public void excluir(Integer id) {
		equipamentoRepository.deleteById(id);
	}
	
	public Collection<Equipamento> obterLista(){
		return (Collection<Equipamento>) equipamentoRepository.findAll();
	}		

	public Collection<Equipamento> obterLista(Usuario usuario){
		return (Collection<Equipamento>) equipamentoRepository.obterLista(usuario.getId());
	}
}
