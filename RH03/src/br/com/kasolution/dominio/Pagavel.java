package br.com.kasolution.dominio;

public interface Pagavel {

	//constantes
	int QTD_MAXIMA_PAGAVEIS = 1000;
	
	//m�todos public abstract
	String getDescricao();
	double calculaValorPagamento();
	
}
