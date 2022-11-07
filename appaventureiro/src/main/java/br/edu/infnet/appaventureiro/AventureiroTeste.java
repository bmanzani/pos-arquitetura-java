package br.edu.infnet.appaventureiro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appaventureiro.model.domain.Aventureiro;
import br.edu.infnet.appaventureiro.model.domain.Usuario;
import br.edu.infnet.appaventureiro.model.service.AventureiroService;

@Order(3)
@Component
public class AventureiroTeste implements ApplicationRunner {

	@Autowired
	private AventureiroService aventureiroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("## Cadastramento de Aventureiros ##");
		
		Usuario usuario = new Usuario();
		usuario.setId(1);

		Aventureiro aventureiro1 = new Aventureiro();
		aventureiro1.setNome("Ragnir");
		aventureiro1.setClasse("Guerreiro");
		aventureiro1.setLevel(60);
		aventureiro1.setUsuario(usuario);
		aventureiroService.incluir(aventureiro1);

		Aventureiro aventureiro2 = new Aventureiro();
		aventureiro2.setNome("Freij");
		aventureiro2.setClasse("Mago");
		aventureiro2.setLevel(60);
		aventureiro2.setUsuario(usuario);
		aventureiroService.incluir(aventureiro2);

		Aventureiro aventureiro3 = new Aventureiro();
		aventureiro3.setNome("Siegfried");
		aventureiro3.setClasse("Caçador");
		aventureiro3.setLevel(60);
		aventureiro3.setUsuario(usuario);
		aventureiroService.incluir(aventureiro3);
	}
}
