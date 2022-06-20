package br.com.kasolution.teste;

import java.util.ArrayList;

import br.com.kasolution.dados.BDFatura;
import br.com.kasolution.dados.BDFuncionario;
import br.com.kasolution.dominio.OrdemPagamento;
import br.com.kasolution.dominio.Pagavel;

public class TesteOrdemPagamento {

	public static void main(String[] args) {
		ArrayList<Pagavel> pagaveis = new ArrayList<>();
		pagaveis.addAll(BDFuncionario.getFuncionarios());
		pagaveis.addAll(BDFatura.getFaturas());
		
		OrdemPagamento op = new OrdemPagamento(pagaveis);
		System.out.println(op.toString());
	}
	
}
