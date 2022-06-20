package br.com.kasolution.dominio;

import java.text.NumberFormat;

public class Comissionado extends Funcionario {
	
	private double vendaBruta;
	private double porcentagemComissao;

	public Comissionado(String nome, long cpf, double vendaBruta, double porcentagemComissao) {
		super(nome, cpf);
		this.vendaBruta = vendaBruta;
		this.porcentagemComissao = porcentagemComissao;
	}

	public Comissionado(String nome, long cpf, String setor, double vendaBruta, double porcentagemComissao) {
		super(nome, cpf, setor);
		this.vendaBruta = vendaBruta;
		this.porcentagemComissao = porcentagemComissao;
	}

	public double getVendaBruta() {
		return vendaBruta;
	}

	public void setVendaBruta(double vendaBruta) {
		this.vendaBruta = vendaBruta;
	}

	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString())
				.append("\nVenda bruta: ").append(NumberFormat.getCurrencyInstance().format(vendaBruta))
				.append("\n% Comissão: ").append(String.format("%.2f%%", porcentagemComissao));
		return info.toString();
	}

	@Override
	public double calculaValorPagamento() {
		return vendaBruta * porcentagemComissao;
	}
	
	@Override
	public String getTipo() {
		return "Comissionado";
	}
	
}
