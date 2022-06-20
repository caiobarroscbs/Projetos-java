package br.com.kasolution.dominio;

import static java.text.NumberFormat.*;

public class Horista extends Funcionario {

	private double valorHora;
	private double horasTrabalhadas;

	public Horista(String nome, long cpf, double valorHora, double horasTrabalhadas) {
		super(nome, cpf);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Horista(String nome, long cpf, String setor, double valorHora, double horasTrabalhadas) {
		super(nome, cpf, setor);
		this.valorHora = valorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString()) // toString() de Funcionario
				.append("\nValor hora: ").append(getCurrencyInstance().format(valorHora))
				.append("\nHoras trabalhadas: ").append(getNumberInstance().format(horasTrabalhadas));
		return info.toString();
	}

	@Override
	public double calculaValorPagamento() {
		return valorHora * horasTrabalhadas;
	}

	@Override
	public String getTipo() {
		return "Horista";
	}
	
	

}
