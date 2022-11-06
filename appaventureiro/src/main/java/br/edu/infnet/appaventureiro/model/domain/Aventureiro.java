package br.edu.infnet.appaventureiro.model.domain;

public class Aventureiro {
	private Integer id;
	private String nome;
	private String classe;
	private int level;
	
	@Override
	public String toString() {
		return id + ";" + nome + ";" + classe + ";" + level;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
