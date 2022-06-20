package br.com.kasolution.principal;

import java.util.Scanner;

public class VerificaStatus {

	public static void main(String[] args) {
		//input dos dados
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o nome do aluno: ");
		String nome = sc.nextLine();
		double[] notas = new double[4];
		System.out.print("Informe as notas separadas por espaço: ");
		notas[0] = sc.nextDouble();
		notas[1] = sc.nextDouble();
		notas[2] = sc.nextDouble();
		notas[3] = sc.nextDouble();
		//processamento dos dados
		double soma = 0;
		for (double n : notas) {
			soma += n;
		}
		double media = soma/notas.length;
		String status = "Aprovado";
		if (media < 7.0) {
			status = "Reprovado";
		}
		//output dos dados
		System.out.println("\n[-- Dados processados --]");
		System.out.printf(
				"Nome do aluno: %s \n" +
		        "Média: %.2f \n" +
				"Status: %s \n", nome, media, status
		);
	}

}
