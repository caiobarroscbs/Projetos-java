package br.com.kasolution.teste;

import br.com.kasolution.dados.BDClientes;
import br.com.kasolution.dominio.Cliente;
import br.com.kasolution.ferramentas.Calculadora;

public class TesteCalculadora01 {

	public static void main(String[] args) {
		//meses ate R$120.000,00
		Cliente[] clientes = BDClientes.CLIENTES; //todos os clientes
		for (Cliente c : clientes ) {
			System.out.println(c.nome);
			int meses = Calculadora.obterMesesNecessarios(c, 120_000.00);
			System.out.printf("Meses necessários: %d \n", meses);
			System.out.println();
		}
	}

}
