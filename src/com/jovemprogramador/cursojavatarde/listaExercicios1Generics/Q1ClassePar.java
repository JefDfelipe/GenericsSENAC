package com.jovemprogramador.cursojavatarde.listaExercicios1Generics;

public class Q1ClassePar<T,U> {

	public T coordX;
	public U coordY;
	
	public Q1ClassePar(T coordX_, U coordY_) {
		coordX = coordX_;
		coordY = coordY_;
	}

	public T getX() {
		return coordX;
	}

	public void setX(T coordX) {
		this.coordX = coordX;
	}

	public U getY() {
		return coordY;
	}

	public void setY(U coordY) {
		this.coordY = coordY;
	}
	
	@Override
	public String toString() {
		return "Classe Par{" + "coordenada X = " + coordX + ", coordenada Y = " + coordY+"}";
	}
}
