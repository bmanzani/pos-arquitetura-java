package br.edu.infnet.appaventureiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tarmadura")
public class Armadura extends Equipamento {
	private boolean encantada;
	private float defesa;
	private String recomendacoes;
	
	@Override
	public String toString() {
		return super.toString() + encantada + ";" + defesa + ";" + recomendacoes;
	}

	public boolean isEncantada() {
		return encantada;
	}

	public void setEncantada(boolean encantada) {
		this.encantada = encantada;
	}

	public float getDefesa() {
		return defesa;
	}

	public void setDefesa(float defesa) {
		this.defesa = defesa;
	}

	public String getRecomendacoes() {
		return recomendacoes;
	}

	public void setRecomendacoes(String recomendacoes) {
		this.recomendacoes = recomendacoes;
	}	
}
