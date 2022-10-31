package br.edu.infnet.appaventureiro.model.domain;

import java.time.LocalDateTime;

public class Pedido {
	public String descricao;
	public LocalDateTime data;
	public boolean encomenda;
	
	public String toString() {
		return descricao + ";" + data + ";" + encomenda;
	}
}
