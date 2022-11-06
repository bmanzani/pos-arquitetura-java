package br.edu.infnet.appaventureiro.model.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tarma")
public class Arma extends Equipamento {
	private boolean ranged;
	private float peso;
	private String elemento;
	private String tipo;
	
	@Override
	public String toString() {
		return super.toString() + ranged + ";" + peso + ";" + elemento+ ";" + tipo;
	}
	
	public boolean isRanged() {
		return ranged;
	}

	public void setRanged(boolean ranged) {
		this.ranged = ranged;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
