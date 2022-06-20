package br.com.kasolution.dominio;

public interface Pagavel {

	//constantes
	int QTD_MAXIMA_PAGAVEIS = 1000;
	
	//métodos public abstract
	String getDescricao();
	double calculaValorPagamento();
	
}
