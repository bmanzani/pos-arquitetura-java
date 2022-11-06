package br.edu.infnet.appaventureiro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaventureiro.model.domain.Arma;

@Repository
public interface ArmaRepository extends CrudRepository<Arma, Integer>{

}
