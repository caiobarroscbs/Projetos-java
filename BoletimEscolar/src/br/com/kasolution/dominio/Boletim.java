package br.com.kasolution.dominio;

public class Boletim {
	
	public String dataHoraImpressao;
	public Aluno[] alunos = new Aluno[10]; //[null][null][null]...

	//construtor (CTRL+3 => gcuf)
	public Boletim(String dataHoraImpressao, Aluno[] alunos) {
		this.dataHoraImpressao = dataHoraImpressao;
		this.alunos = alunos;
	}
	
	//outros métodos
	public void imprime() {
		for ( Aluno a : alunos ) {
			if (a == null) continue;
			
			a.imprime();
			System.out.println("\n");
		}
	}

}
