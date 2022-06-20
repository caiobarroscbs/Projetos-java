package br.com.kasolution.teste;

import br.com.kasolution.dominio.Horista;

public class TesteEqualsToString {
	
	public static void main(String[] args) {
		Horista h1 = new Horista("Guilherme Yago Eduardo da Costa", 84326402393L, "TI", 120, 100);
		Horista h2 = new Horista("Guilherme Yago Eduardo da Costa", 84326402393L, "TI", 120, 100);
		
		System.out.printf("%s\n\n%s\n\n", h1.toString(), h2.toString());
		
		if (h1.equals(h2)) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}

}
