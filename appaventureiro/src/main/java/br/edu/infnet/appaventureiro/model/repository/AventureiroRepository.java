package br.edu.infnet.appaventureiro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;


@Repository
public interface AventureiroRepository extends CrudRepository<Aventureiro, Integer> {
	
		@Query("from Aventureiro s where s.usuario.id = :userid")
		List<Aventureiro> obterLista(Integer userid);
}
