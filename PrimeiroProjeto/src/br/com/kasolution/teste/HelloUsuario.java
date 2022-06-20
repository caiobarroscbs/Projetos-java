package br.com.kasolution.teste;

import java.util.Scanner;

public class HelloUsuario {

	public static void main(String[] args) {
		//importação => CTRL + SHIFT + O
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual o seu nome: ");
		String nomeUsuario = sc.nextLine(); //le o nome do usuario
		System.out.print("Qual a sua idade: ");
		int idadeUsuario = sc.nextInt(); //le a idade do usuario
		System.out.println("\n\nOs dados foram processados:");
		System.out.println("Nome: " + nomeUsuario);
		System.out.println("Idade: " + idadeUsuario);
	}

}
