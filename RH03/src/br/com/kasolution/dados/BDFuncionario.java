package br.com.kasolution.dados;

import java.util.ArrayList;

import br.com.kasolution.dominio.Assalariado;
import br.com.kasolution.dominio.Comissionado;
import br.com.kasolution.dominio.ComissionadoAssalariado;
import br.com.kasolution.dominio.Fatura;
import br.com.kasolution.dominio.Funcionario;
import br.com.kasolution.dominio.Horista;

public class BDFuncionario {
	
	static final ArrayList<Funcionario> funcionarios = new ArrayList<>(){{
		add(new Horista("Guilherme Yago Eduardo da Costa", 84326402393L, "TI", 120, 100));
		add(new Assalariado("Tiago Joaquim Samuel Lima", 80604769040L, "RECURSOS HUMANOS", 1_600.00));
		add(new Comissionado("Paulo Fábio Araújo", 94567839951L, "COMERCIAL", 60_000.00, .1));
		add(new ComissionadoAssalariado("Luzia Laís da Mota", 7602132246L, "COMERCIAL", 45_000.00, .1, 2_100.00));
		add(new Horista("Victor Mateus da Silva", 39778754187L, "TI", 120, 80));
		add(new Assalariado("Cauê Pietro Lima", 9246176162L, "RECURSOS HUMANOS", 1_750.00));
		add(new Comissionado("Francisco Osvaldo Rezende", 84536666443L, "COMERCIAL", 80_000.00, .1));
		add(new ComissionadoAssalariado("Flávia Giovana Pereira", 51415847630L, "COMERCIAL", 75_000.00, .1, 2_100.00));
		add(new Horista("Manuela Gabriela Teixeira", 38576964783L, "TI", 150, 200));
		add(new Assalariado("Sarah Isabella Nogueira", 1295615096L, "RECURSOS HUMANOS", 2_000.00));
		add(new Comissionado("Renan Bryan Porto", 10824971850L, "COMERCIAL", 53_000.00, .1));
		add(new ComissionadoAssalariado("Cristiane Melissa Melo", 19915261640L, "COMERCIAL", 47_000.00, .1, 2_100.00));
	}};

	public static ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
}
