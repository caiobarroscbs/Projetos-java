package br.com.kasolution.dominio;

public class Campeonato {
	
	public static final String[] timesMineiros = {"Atl�tico", "Cruzeiro", "Am�rica", "Uberl�ndia", "Pouso Alegre"};
	public static final String[] timesPaulistas = {"Corinthians", "S�o Paulo", "Palmeiras", "Santos", "Portugu�sa"};

	
	static public Partida obterPartida() {
		Partida p = new Partida();
		int tA  = (int) (Math.random() * timesMineiros.length); //(0 - 4)
		int tB  = (int) (Math.random() * timesPaulistas.length);//(0 - 4)
		p.timeA = timesMineiros[tA];
		p.timeB = timesPaulistas[tB];
		p.golsTimeA = (int) (Math.random() * 7) + 1;//0 - 7
		p.golsTimeB = (int) (Math.random() * 7) + 1;//0 - 7

		return p;
	}
	
}
