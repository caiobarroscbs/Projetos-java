package br.com.kasolution.dominio;

import static java.text.NumberFormat.*;

public abstract class Funcionario implements Pagavel {

	static private int ultimoCodigo = 0;

	final private int codigo;
	private String nome;
	final private long cpf;
	private String setor;
	private boolean ativo;

	public Funcionario(String nome, long cpf) {
		this.codigo = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		this.setor = "Não especificado";
		this.ativo = true;
	}

	public Funcionario(String nome, long cpf, String setor) {
		this.codigo = ++ultimoCodigo;
		this.nome = nome;
		this.cpf = cpf;
		this.ativo = true;
		this.setSetor(setor);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public long getCpf() {
		return cpf;
	}

	public String getSetor() {
		return setor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setNome(String nome) {
		if (nome.length() > 2) {
			this.nome = nome;
		}
	}

	public void setSetor(String setor) {
		switch (setor.toUpperCase()) {
		case "ADMINISTRATIVO":
		case "FINANCEIRO":
		case "RECURSOS HUMANOS":
		case "COMERCIAL":
		case "TI":
			this.setor = setor;
			break;
		default:
			this.setor = "Não especificado";
		}
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Funcionário: ").append(codigo)
				.append("\nTipo: ").append(getTipo())
				.append("\nNome: ").append(nome)
				.append("\nCPF.: ").append(cpf)
				.append("\nSetor: ").append(setor).append("\nSituação: ")
				.append(ativo ? "Ativo" : "Inativo")
				.append("\n$ Pagamento: ")
				.append(getCurrencyInstance().format(calculaValorPagamento()));
		return info.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Funcionario) {
			Funcionario funcionarioComparacao = (Funcionario) obj; // cast para Funcionario
			if (funcionarioComparacao.getNome().equals(this.nome) && funcionarioComparacao.getCpf() == this.getCpf()) {
				return true;
			}
		}
		return false;
	}

	public abstract double calculaValorPagamento();

	public abstract String getTipo();
	
	@Override
	public String getDescricao() {
		return String.format("Funcionario %s: %s", getTipo(), getNome());
	}

}
