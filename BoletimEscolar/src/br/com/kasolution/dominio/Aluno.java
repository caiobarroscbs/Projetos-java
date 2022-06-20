package br.com.kasolution.dominio;

public class Aluno {
	
	//atributos ou campos
	public String nome;
	public long numeroMatricula;
	public String curso;
	public double[] notas = new double[4];

	//construtores (CTRL+3 => gcuf)
	public Aluno(String nome, long numeroMatricula, String curso, double[] notas) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
		this.notas = notas;
	}

	//(nome, curso, notas)
	public Aluno(String nome, String curso, double[] notas) {
		this.nome = nome;
		this.curso = curso;
		this.notas = notas;
	}

	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
	}
	
	public Aluno() {
		
	}

	//outros métodos
	public double obterMedia() {
		double soma = 0;
		for (double n : notas) {
			soma += n;
		}
		double media = soma/notas.length; //tamanho do array
		
		return media;
	}
	
	public boolean obterAprovacao() {
		return (obterMedia() >= 7.0);
	}
	
	public void imprime() {
		System.out.println("[- DADOS DO ALUNO -]");
		System.out.println("Nome: #" + nome);
		System.out.println("Matrícula: " + numeroMatricula);
		System.out.println("Curso: " + curso);
		System.out.printf("Média: %.2f \n", obterMedia());
		//operador ternário
		String statusAprovacao = obterAprovacao() ? "Aprovado" : "Reprovado";
		System.out.println("Situação: " + statusAprovacao);
	}
	
}
