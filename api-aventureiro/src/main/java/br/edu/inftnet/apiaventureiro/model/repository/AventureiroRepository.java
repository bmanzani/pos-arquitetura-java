package br.edu.inftnet.apiaventureiro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.inftnet.apiaventureiro.model.domain.Aventureiro;

@Repository
public interface AventureiroRepository extends CrudRepository<Aventureiro, Integer> {
	
	@Query("FROM Aventureiro a WHERE a.usuario.id =:id")
	List<Aventureiro> obterListaPorID(Integer id);
}
