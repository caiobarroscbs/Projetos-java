package br.com.kasolution.teste;

import br.com.kasolution.dominio.Funcionario;

public class TesteFuncionario01 {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Regina Camila Dias", 94290056857L);
		f1.setSetor("TI");
		f1.aumentaSalario(12_000.00);
		System.out.println(f1.imprime());
		System.out.println();
		
		Funcionario f2 = new Funcionario("Isaac Kaique Pereira", 72070374491L);
		f2.setSetor("Administrativo");
		f2.aumentaSalario(8_000.00);
		System.out.println(f2.imprime());
	}

}
