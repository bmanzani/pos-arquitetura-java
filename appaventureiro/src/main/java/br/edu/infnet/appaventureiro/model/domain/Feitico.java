package br.edu.infnet.appaventureiro.model.domain;

public class Feitico extends Equipamento {
	public boolean consumivel;
	public float qtdemana;
	public String elemento;
	public String classe;
	
	@Override
	public String toString() {
		return consumivel + ";" + qtdemana + ";" + elemento+ ";" + classe;
	}
}
