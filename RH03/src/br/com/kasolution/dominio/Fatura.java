package br.com.kasolution.dominio;

import static java.text.NumberFormat.*;

public class Fatura implements Pagavel {
	
	private static long ultimoCodigo = 0;
	
	private long codigo;
	private String descricao;
	private long quantidade;
	private double valorUnitario;
	
	public Fatura(String descricao, long quantidade, double valorUnitario) {
		this.codigo = ++ultimoCodigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}

	public static long getUltimoCodigo() {
		return ultimoCodigo;
	}

	public static void setUltimoCodigo(long ultimoCodigo) {
		Fatura.ultimoCodigo = ultimoCodigo;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Fatura: ")
				.append(codigo)
				.append("\nDescrição: ").append(descricao)
				.append("\nQuantidade: ").append(quantidade)
				.append("\n$ Unitário: ").append(getNumberInstance().format(valorUnitario))
				.append("\n$ Total: ").append(calculaValorPagamento());
		return info.toString();
	}
	
	@Override
	public double calculaValorPagamento() {
		return quantidade * valorUnitario;
	}

}
