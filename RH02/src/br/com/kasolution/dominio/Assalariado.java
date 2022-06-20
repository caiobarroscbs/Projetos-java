package br.com.kasolution.dominio;

import java.text.NumberFormat;

public class Assalariado extends Funcionario {

	private double salarioSemanal;

	public Assalariado(String nome, long cpf, double salarioSemanal) {
		super(nome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	public Assalariado(String nome, long cpf, String setor, double salarioSemanal) {
		super(nome, cpf, setor);
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString())
				.append("\nSalário semanal: ").append(NumberFormat.getCurrencyInstance().format(salarioSemanal));
		return info.toString();
	}
	
	@Override
	public double calculaValorPagamento() {
		return salarioSemanal * 4.5;
	}
	
	@Override
	public String getTipo() {
		return "Assalariado";
	}
}
