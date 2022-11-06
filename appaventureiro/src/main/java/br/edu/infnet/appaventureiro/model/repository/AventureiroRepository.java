package br.edu.infnet.appaventureiro.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;

@Repository
public interface AventureiroRepository extends CrudRepository<Aventureiro, Integer> {

}
