package br.edu.infnet.appaventureiro.model.domain;

public abstract class Equipamento {
	private Integer id;
	private int codigo;
	private String nome;
	private float valor;
	private int level;

	@Override
	public String toString() {
		return id + ";" + codigo + ";" + nome + ";" + valor + ";" + level + ";";
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
