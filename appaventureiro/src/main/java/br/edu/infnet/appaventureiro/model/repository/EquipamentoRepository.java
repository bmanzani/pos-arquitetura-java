package br.edu.infnet.appaventureiro.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appaventureiro.model.domain.Equipamento;

@Repository
public interface EquipamentoRepository extends CrudRepository<Equipamento, Integer>{

	@Query("from Equipamento p where p.usuario.id =:userid")
	List<Equipamento> obterLista(Integer userid);
}
