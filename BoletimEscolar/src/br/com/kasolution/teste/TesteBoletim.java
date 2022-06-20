package br.com.kasolution.teste;

import br.com.kasolution.dominio.Aluno;
import br.com.kasolution.dominio.Boletim;

public class TesteBoletim {

	public static void main(String[] args) {

		//CTRL+SHIT+O => importação
		Aluno a1 = new Aluno("Luciano Dias", 1000, "Java Básico", new double[]{5.0, 6.0, 7.0, 8.0});
		Aluno a2 = new Aluno("Marcela Silva", 2000, "Java Básico", new double[]{5.5, 8.0, 8.5, 8.0});
		Aluno a3 = new Aluno("Bruno Ferreira", 3000, "Java Básico", new double[]{7.0, 7.5, 7.0, 9.0});
		Aluno a4 = new Aluno("Camila Souza", 4000, "Java Básico", new double[]{5.0, 6.0, 6.0, 5.5});
		
		//CTRL+SHIT+O => importação
		Boletim boletim = new Boletim("05/03/2022 19h00", new Aluno[] {a1, a2, a3, a4});
		boletim.imprime();
		
	}

}
