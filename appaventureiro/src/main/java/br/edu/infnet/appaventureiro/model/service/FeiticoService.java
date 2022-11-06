package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.domain.Feitico;
import br.edu.infnet.appaventureiro.model.repository.FeiticoRepository;

@Service
public class FeiticoService {

	@Autowired
	private FeiticoRepository feiticoRepository;

	public void incluir(Feitico feitico) {
		feiticoRepository.save(feitico);
	}

	public void excluir(Integer id) {
		feiticoRepository.deleteById(id);
	}

	public Collection<Feitico> obterLista() {
		return (Collection<Feitico>) feiticoRepository.findAll();
	}
}
