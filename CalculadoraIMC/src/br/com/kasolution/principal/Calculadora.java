package br.com.kasolution.principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Preencha o formulário com os dados do paciente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Sexo: ");
		String sexo = sc.next();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		//calculo do IMC
		double imc = peso / (altura * altura);
		System.out.println("\n[-- Cáculo do IMC --]");
		System.out.println("Paciente: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
		System.out.printf("IMC: %.3f \n", imc);
		//diagnóstico paciente
		System.out.print("Situação: ");
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc < 25.0) {
			System.out.println("Normal");
		} else if (imc < 30.0) {
			System.out.println("Sobrepeso");
		} else if (imc < 35.0) {
			System.out.println("Obesidade Grau I");
		} else if (imc < 40.0) {
			System.out.println("Obesidade Grau II");
		} else {
			System.out.println("Obesidade Mórbida");
		}
	}

}
