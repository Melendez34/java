package com.generation;

public class Cuadrado extends FiguraGeometrica{
	public Cuadrado() {
		super("Cuadrado");
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return getAlto() * getLargo();
	}

	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return (getAlto() + getLargo()) * 2;
	}
}
