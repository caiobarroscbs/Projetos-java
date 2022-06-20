package br.com.kasolution.teste;

import java.util.Scanner;

import br.com.kasolution.dominio.Piramide;

public class TesteArrayPiramide {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o tamanho da pirâmide: ");
		
		int t = sc.nextInt();
		if (t < 1 || t > 99) t = 10;
		
		Piramide piramide = new Piramide(t);
		piramide.imprime();
	}

}
