package br.com.kasolution.teste;

import br.com.kasolution.dominio.Campeonato;
import br.com.kasolution.dominio.Partida;

public class TesteSimulador {

	public static void main(String[] args) {

		Partida partidas[] = new Partida[10];
		partidas[0] = Campeonato.obterPartida();
		partidas[1] = Campeonato.obterPartida();
		partidas[2] = Campeonato.obterPartida();
		partidas[3] = Campeonato.obterPartida();
		partidas[4] = Campeonato.obterPartida();
		partidas[5] = Campeonato.obterPartida();
		partidas[6] = Campeonato.obterPartida();
		partidas[7] = Campeonato.obterPartida();
		partidas[8] = Campeonato.obterPartida();
		partidas[9] = Campeonato.obterPartida();
		
		for (Partida p : partidas) {
			System.out.println(p.imprime());
			System.out.println();
		}
		
		
	}

}
