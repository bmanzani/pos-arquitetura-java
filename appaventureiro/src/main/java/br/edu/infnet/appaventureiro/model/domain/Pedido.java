package br.edu.infnet.appaventureiro.model.domain;

import java.time.LocalDateTime;

public class Pedido {
	private String descricao;
	private LocalDateTime data;
	private boolean encomenda;
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + encomenda;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isEncomenda() {
		return encomenda;
	}

	public void setEncomenda(boolean encomenda) {
		this.encomenda = encomenda;
	}
}
