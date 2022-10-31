package br.edu.infnet.appaventureiro.model.domain;

public class Equipamento {
	public int codigo;
	public String nome;
	public float valor;
	public int level;
	
	@Override
	public String toString() {
		return codigo + ";" + nome + ";" + valor + ";" + level;
	}
}
