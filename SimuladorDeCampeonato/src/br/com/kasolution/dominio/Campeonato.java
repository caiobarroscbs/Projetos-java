package br.com.kasolution.dominio;

public class Campeonato {
	
	public static final String[] timesMineiros = {"Atlético", "Cruzeiro", "América", "Uberlândia", "Pouso Alegre"};
	public static final String[] timesPaulistas = {"Corinthians", "São Paulo", "Palmeiras", "Santos", "Portuguêsa"};

	
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
