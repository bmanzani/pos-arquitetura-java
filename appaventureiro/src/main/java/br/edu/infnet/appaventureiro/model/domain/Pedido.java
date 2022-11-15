package br.edu.infnet.appaventureiro.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tpedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean encomenda;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idAventureiro")
	private Aventureiro aventureiro;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Equipamento> equipamentos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public void setEncomenda(boolean web) {
		this.encomenda = web;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
