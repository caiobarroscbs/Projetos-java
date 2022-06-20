package br.com.kasolution.dominio;

import static java.text.NumberFormat.getCurrencyInstance;
import static java.text.NumberFormat.getNumberInstance;

public class ComissionadoAssalariado extends Comissionado {
	
	private double salarioMensal;

	public ComissionadoAssalariado(String nome, long cpf, double vendaBruta, double porcentagemComissao,
			double salarioMensal) {
		super(nome, cpf, vendaBruta, porcentagemComissao);
		this.salarioMensal = salarioMensal;
	}

	public ComissionadoAssalariado(String nome, long cpf, String setor, double vendaBruta, double porcentagemComissao,
			double salarioMensal) {
		super(nome, cpf, setor, vendaBruta, porcentagemComissao);
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString()) // toString() de Comissionado
				.append("\nSalário mensal: ").append(getCurrencyInstance().format(salarioMensal));
		return info.toString();
	}

	@Override
	public double calculaValorPagamento() {
		return super.calculaValorPagamento() + salarioMensal;
	}

	@Override
	public String getTipo() {
		return super.getTipo().concat(" Assalariado");
	}
	
	
}
