package br.edu.infnet.appaventureiro.model.domain;

public class Armadura extends Equipamento {
	public boolean encantada;
	public float defesa;
	public String recomendacoes;
	
	@Override
	public String toString() {
		return encantada + ";" + defesa + ";" + recomendacoes;
	}
}
