package br.com.kasolution.teste;

import java.util.ArrayList;

import br.com.kasolution.dados.BDFuncionario;
import br.com.kasolution.dominio.Funcionario;
import static java.lang.System.*;

public class TesteLambda {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios  = BDFuncionario.getFuncionarios();

		//funcionarios que recebem acima de R$8.000,00
		funcionarios.stream()
			.filter(f -> f.calculaValorPagamento() > 8_000.00)
			.forEach(f -> out.printf("%s \n\n", f));
		
		//imprimir todos os funcionarios da TI
		funcionarios.stream()
			.filter(f -> f.getSetor().equals("TI"))
			.forEach(f -> out.printf("%s \n\n", f));
		
		//funcionarios soma de todos os salários
		double somaDosSalaraios = funcionarios.stream()
									.mapToDouble(f -> f.calculaValorPagamento())
									.sum();
		System.out.printf("Soma dos salários: %.2f\n\n", somaDosSalaraios);
		
		//funcionarios soma de todos os salários
		double somaSalaraiosTI = funcionarios.stream()
									.filter(f -> f.getSetor().equals("TI"))
									.mapToDouble(f -> f.calculaValorPagamento())
									.sum();
		System.out.printf("Soma dos salários de TI: %.2f\n\n", somaSalaraiosTI);	
		
	}

}
