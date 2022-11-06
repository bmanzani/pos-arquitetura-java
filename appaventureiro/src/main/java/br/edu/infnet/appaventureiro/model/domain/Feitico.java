package br.edu.infnet.appaventureiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tfeitico")
public class Feitico extends Equipamento {
	private boolean consumivel;
	private float qtdemana;
	private String elemento;
	private String classe;
	
	public boolean isConsumivel() {
		return consumivel;
	}

	public void setConsumivel(boolean consumivel) {
		this.consumivel = consumivel;
	}

	public float getQtdemana() {
		return qtdemana;
	}

	public void setQtdemana(float qtdemana) {
		this.qtdemana = qtdemana;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return super.toString() + consumivel + ";" + qtdemana + ";" + elemento+ ";" + classe;
	}
}
