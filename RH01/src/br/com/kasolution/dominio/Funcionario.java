package br.com.kasolution.dominio;

import static java.text.NumberFormat.*;

import java.text.NumberFormat;

public class Funcionario {
	
	static private int ultimoCodigo = 0;
	
	final private int codigo;
	private String nome;
	final private long cpf;
	private String setor;
	private double salario;
	private boolean ativo;

	public Funcionario(String nome, long cpf) {
		ultimoCodigo++;
		this.codigo = ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		this.ativo = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 2) {
			this.nome = nome;
		}
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		switch (setor.toUpperCase()) {
			case "ADMINISTRATIVO" :
			case "FINANCEIRO" :
			case "RECURSOS HUMANOS" :
			case "COMERCIAL" :
			case "TI" :
				this.setor = setor;
		}
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getCodigo() {
		return codigo;
	}

	public long getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}
	
	public void aumentaSalario(double valor) {
		if (valor > 0) {
			this.salario += valor;
		}
	}
	
	public String imprime() {
		StringBuilder sb = new StringBuilder("Funcionario: ").append(codigo)
				.append("\nNome: ").append(nome)
				.append("\nCPF.: ").append(cpf)
				.append("\nSetor: ").append(setor)
				.append("\nSalário: ").append(NumberFormat.getCurrencyInstance().format(salario))
				.append("\nSituação: ").append(ativo ? "Ativo" : "Inativo");

		return sb.toString();
	}

}
