package com.jovemprogramador.cursojavatarde.listaExercicios1Generics;

public class TesteGenerics {

	public static void main(String[] args) {
		// Classe teste
		
		Q1ClassePar<Float, Float> coordenadas = new Q1ClassePar<>(20f, 30f);
		Q1ClassePar<String, Double> aluno = new Q1ClassePar<>("Fulano", 10d);

		System.out.println(coordenadas.toString());
		System.out.println(aluno.coordX + " " + aluno.coordY);
	}
}