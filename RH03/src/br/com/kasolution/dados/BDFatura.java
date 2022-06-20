package br.com.kasolution.dados;

import java.util.ArrayList;

import br.com.kasolution.dominio.Fatura;

public class BDFatura {
	static final ArrayList<Fatura> faturas = new ArrayList<>() {{
		add(new Fatura("Notebook teletrabalho", 15, 3_700.00));
		add(new Fatura("Cafeteira", 5, 1_300.00));
		add(new Fatura("Pintura fachada", 2, 600.00));
		add(new Fatura("Jardinagem externa escritório", 1, 780.00));
		add(new Fatura("Impressoras", 5, 2_200.00));
		add(new Fatura("Monitores", 15, 1_900.00));
		add(new Fatura("Pacote copo descartável", 100, 4.60));
		add(new Fatura("WebCams", 15, 440.00));
		add(new Fatura("Mouse", 15, 90.00));
		add(new Fatura("Teclado", 15, 120.00));
	}};

	public static ArrayList<Fatura> getFaturas() {
		return faturas;
	}

}
