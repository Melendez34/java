package com.generation;

public class Tacos {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = 0.0f;
	
	//el constructor nos ayuda a inicializar objetos
		
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String tamanioDeTortilla,
			float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	public Tacos() {
		
	}
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if (numeroDeTortilla > 3) {
			throw new IllegalArgumentException("Son muchas Tortillas!!");
		} else if(numeroDeTortilla < 3 && numeroDeTortilla >= 1) {
			this.numeroDeTortilla = numeroDeTortilla;
		} else if(numeroDeTortilla < 1) {
			throw new IllegalArgumentException("Sin tortilla, No es taco!!");
		}
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		if(tamanioDeTortilla == "grande" && tamanioDeTortilla == "pequeña") {
			this.tamanioDeTortilla = tamanioDeTortilla;
		}else {
			throw new IllegalArgumentException("tamaño incorrecto!");
		}
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	void preparar() {
		System.out.println("Preparando ricos tacos");
	}
	
	void vender() {
		System.out.println("Taco vendido");
	}
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica...");
		System.out.println("Listo.");
	}
	
	void subirPrecio(float aumento) {
		precio += aumento;
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	

}
