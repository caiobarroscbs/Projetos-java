package br.com.kasolution.teste;

import br.com.kasolution.dominio.Calculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		//CTRL+SHIFT+O
		//Calculadora c = new Calculadora(); //criar objeto calculadora
		System.out.println("1: " + Calculadora.soma(7.5, 8.0));
		System.out.println("2: " + Calculadora.soma(7.5f, 8.0f));
		System.out.println("3: " + Calculadora.soma(100, 200, 300));
		System.out.println("4: " + Calculadora.soma(100L, 200L, 300L));
		System.out.println("5: " + Calculadora.soma(100, 200, 300, 400, 500, 600));
		System.out.println("6: " + Calculadora.soma(100.0, 200.0, 300.0, 400.0, 500.0, 600.0));

	}

}
