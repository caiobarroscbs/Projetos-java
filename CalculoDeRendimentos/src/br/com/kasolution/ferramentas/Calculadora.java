package br.com.kasolution.ferramentas;

import br.com.kasolution.dominio.Cliente;

public class Calculadora {
	
	public static final double TAXA_CORRECAO = 1.2; //mensal
	
	static public int obterMesesNecessarios(Cliente cliente, double valorDesejado) {
		double saldoInicial = cliente.saldoEmConta;
		int meses = 0;
		while (saldoInicial < valorDesejado) {
			saldoInicial *= TAXA_CORRECAO; //saldoInicial = saldoInicial * TAXA_CORRECAO
			meses++;
		}
	
		return meses;
	}
	
	
	static public double obterSaldoAposMeses(Cliente cliente, int meses) {
		if (meses <= 0) {
			return 0.0; //sempre é a última linha executada (retorna 0 e finaliza o método)
		}
		
		double saldoInicial = cliente.saldoEmConta;
		for (int i = 1; i <= meses; i++) {
			saldoInicial *= TAXA_CORRECAO; 
		}
		
		return saldoInicial;
	}
	

}
