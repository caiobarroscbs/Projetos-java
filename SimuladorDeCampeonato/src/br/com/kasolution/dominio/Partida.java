package br.com.kasolution.dominio;

public class Partida {
	
	public String timeA;
	public String timeB;
	public int golsTimeA;
	public int golsTimeB;	
	
	//imprime()
	public String imprime() {
		StringBuilder sb = new StringBuilder("Placar final de ");
		sb.append(timeA).append(" vs. ").append(timeB).append("\n");
		sb.append(golsTimeA).append(" X ").append(golsTimeB).append("\n");
		String vencedor;
		if (golsTimeA > golsTimeB) {
			vencedor = timeA;
		} else if (golsTimeB > golsTimeA) {
			vencedor = timeB;
		} else {
			vencedor = "EMPATE";
		}
		sb.append("Vencedor: ").append(vencedor).append("\n");
		
		return sb.toString(); //String.valueOf(sb);
	}
}
