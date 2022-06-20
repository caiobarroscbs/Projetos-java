package br.com.kasolution.teste;

import br.com.kasolution.dados.BDClientes;
import br.com.kasolution.dominio.Cliente;
import br.com.kasolution.ferramentas.Calculadora;
import static java.text.NumberFormat.*;

public class TesteCalculadora02 {

	public static void main(String[] args) {
		//valor apos 24 meses
		Cliente[] clientes = BDClientes.CLIENTES; //todos os clientes
		for (Cliente c : clientes ) {
			System.out.println(c.nome);
			double valorFinal = Calculadora.obterSaldoAposMeses(c, 24);
			System.out.printf("Meses necessários: $%,.2f \n",  valorFinal);
			System.out.println();
		}
	}

}
