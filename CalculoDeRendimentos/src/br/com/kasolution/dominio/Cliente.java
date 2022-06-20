package br.com.kasolution.dominio;

public class Cliente {
	
	final public int codigo;
	final public String nome;
	final public double saldoEmConta;

	public Cliente(int codigo, String nome, double saldoEmConta) {
		this.codigo = codigo;
		this.nome = nome;
		this.saldoEmConta = saldoEmConta;
	}

}
