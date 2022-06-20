package br.com.kasolution.dominio;

public class Piramide {
	
	public int piramide[][];
	
	public Piramide(int tamanho) {
		piramide = new int[tamanho][];
		for (int i = 0; i < piramide.length; i++) {
			piramide[i] = new int[i+1];
			for (int j = 0; j < piramide[i].length ; j++) {
				piramide[i][j] = j+1;
			}
		}
	}
	
	public void imprime() {
		for (int i = 0; i < piramide.length; i++) {
			for (int j = 0; j < piramide[i].length ; j++) {
				System.out.printf("[%02d]", piramide[i][j]);
			}
			System.out.println(); //quebra a linha
		}
	}

}
