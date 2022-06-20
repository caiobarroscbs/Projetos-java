package br.com.kasolution.teste;

import java.util.ArrayList;

import br.com.kasolution.dados.BDFatura;
import br.com.kasolution.dados.BDFuncionario;
import br.com.kasolution.dominio.OrdemPagamento;
import br.com.kasolution.dominio.Pagavel;

public class TesteOPEmArquivo {

	public static void main(String[] args) {
		ArrayList<Pagavel> pagaveis = new ArrayList<>();
		pagaveis.addAll(BDFuncionario.getFuncionarios());
		pagaveis.addAll(BDFatura.getFaturas());
		
		OrdemPagamento op = new OrdemPagamento(pagaveis);
		op.geraOPEmArquivo("pagaveis.txt");
		System.out.println("Fim do programa!");
	}

}
