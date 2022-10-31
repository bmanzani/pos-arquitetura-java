package br.edu.infnet.appaventureiro.model.domain;

public class Aventureiro {
	public String nome;
	public String classe;
	public int level;
	
	@Override
	public String toString() {
		return nome + ";" + classe + ";" + level;
	}
}
