package br.edu.infnet.appaventureiro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaventureiro.model.domain.Feitico;

@Repository
public interface FeiticoRepository extends CrudRepository<Feitico, Integer>{

}
