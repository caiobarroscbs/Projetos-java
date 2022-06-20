package br.com.kasolution.teste;

import br.com.kasolution.dominio.Assalariado;
import br.com.kasolution.dominio.Comissionado;
import br.com.kasolution.dominio.ComissionadoAssalariado;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Horista;

public class TesteConstrutores01 {

	public static void main(String[] args) {
		
		Funcionario funcionarios[] = new Funcionario[4];
		funcionarios[0] = new Horista("Guilherme Yago Eduardo da Costa", 84326402393L, "TI", 120, 100);
		funcionarios[1] = new Assalariado("Tiago Joaquim Samuel Lima", 80604769040L, "RECURSOS HUMANOS", 1_600.00);
		funcionarios[2] = new Comissionado("Paulo Fábio Araújo", 94567839951L, "COMERCIAL", 60_000.00, .1);
		funcionarios[3] = new ComissionadoAssalariado("Luzia Laís da Mota", 7602132246L, "COMERCIAL", 45_000.00, .1, 2_100.00);
		
		
		for (Funcionario f : funcionarios) {
			System.out.printf("Funcionario: %s \n\n", f);
		}
		
		System.out.println();
		Funcionario funcionario = new Horista("Guilherme Yago Eduardo da Costa", 84326402393L, "TI", 120, 100);
		//funcionario.getValorHora(); erro
		Horista horistaConvertido = (Horista) funcionario;
		horistaConvertido.getValorHora();
	}

}
