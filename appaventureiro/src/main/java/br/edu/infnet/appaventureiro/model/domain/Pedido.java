package br.edu.infnet.appaventureiro.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean encomenda;
	private Aventureiro aventureiro;
	private List<Equipamento> equipamentos;

	public Pedido() {
		data = LocalDateTime.now();
		encomenda = true;
	}

	public Pedido(Aventureiro aventureiro) {
		this();
		this.aventureiro = aventureiro;
	}

	@Override
	public String toString() {
		return id + ";" + descricao + ";" + data + ";" + encomenda + ";" + aventureiro + ";" + equipamentos.size();
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Aventureiro getAventureiro() {
		return aventureiro;
	}

	public void setAventureiro(Aventureiro aventureiro) {
		this.aventureiro = aventureiro;
	}

	public List<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(List<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}
}
