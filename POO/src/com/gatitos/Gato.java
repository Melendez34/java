package com.gatitos;

public class Gato {
	private String nombre;
	private int patas;
	private boolean adoptado;
		
	//Constructor
	public Gato(String nombre, int patas, boolean adoptado) {
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	public Gato() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		if (patas <= 4 && patas >= 0) {
			this.patas = patas;
		} else {
			throw new IllegalArgumentException("El numero de patas no es valido!.");
		}
	}
	
	public boolean isAdoptado() {
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	
	//metodo toString
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}

	
	
	
	

}
