package br.edu.infnet.appaventureiro.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appaventureiro.model.clients.IEnderecoClient;
import br.edu.infnet.appaventureiro.model.clients.IUsuarioClient;
import br.edu.infnet.appaventureiro.model.domain.Endereco;
import br.edu.infnet.appaventureiro.model.domain.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	@Autowired
	private IUsuarioClient usuarioClient;

	public void incluir(Usuario usuario) {
		usuarioClient.incluir(usuario);
	}
	
	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}

	public Collection<Usuario> obterLista(){
		return usuarioClient.obterLista();
	}
	public Usuario validar(String email, String senha) {

		return usuarioClient.validar(email, senha);
	}

	public Endereco obterCep(String cep) {
		return enderecoClient.obterCep(cep);
	}
}

