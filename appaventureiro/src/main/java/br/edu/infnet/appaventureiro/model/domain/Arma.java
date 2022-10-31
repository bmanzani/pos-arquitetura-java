package br.edu.infnet.appaventureiro.model.domain;

public class Arma extends Equipamento {
	public boolean ranged;
	public float peso;
	public String elemento;
	public String tipo;
	
	@Override
	public String toString() {
		return ranged + ";" + peso + ";" + elemento+ ";" + tipo;
	}
}
