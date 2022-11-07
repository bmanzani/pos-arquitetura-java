package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.domain.Usuario;
import br.edu.infnet.appaventureiro.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public Collection<Usuario> obterLista() {
		return (Collection<Usuario>) usuarioRepository.findAll();
	}

	public Usuario validar(String email, String senha) {

		Usuario usuario = usuarioRepository.findByEmail(email);

		if (usuario != null && senha.equals(usuario.getSenha())) {
			return usuario;
		}

		return null;
	}
}
