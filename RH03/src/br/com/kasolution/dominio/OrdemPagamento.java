package br.com.kasolution.dominio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;

public class OrdemPagamento {
	
	final private LocalDate dataEmissao;
	final private ArrayList<Pagavel> pagaveis = new ArrayList<>(); //Funcionario/Fatura
	
	public OrdemPagamento(ArrayList<Pagavel> pagaveis) {
		this.dataEmissao = LocalDate.now(); //Data atual
		this.pagaveis.addAll(pagaveis); //adicionar os pagaveis recebidos no ArrayList
	}
	
	private String dataFormatada(LocalDate data) {
		//formatação da data
		Locale.setDefault(new Locale("PT", "br"));
		return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(data);		
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder().append("[-- Relação de Pagamentos: ")
				.append(dataFormatada(dataEmissao)).append(" --]");
		for (Pagavel p : pagaveis) {
			info.append(String.format("\nDescrição: %s - valor: %s", p.getDescricao(),
					NumberFormat.getCurrencyInstance().format(p.calculaValorPagamento())));
		}
		return info.toString();
	}
	
	public void geraOPEmArquivo(String nomeArquivo) {
		File file = new File("c:/temp/relatorios/" + nomeArquivo);
		PrintStream tela = System.out; //armazena o endereço da saída em tela
		try {
			PrintStream arquivo = new PrintStream(file);
			System.setOut(arquivo); //imprime no arquivo
			pagaveis.forEach(p -> System.out.printf("%s\n\n", p));
			System.setOut(tela); //imprime na tela
			System.out.println("Arquivo gravado no disco!");
		} catch (FileNotFoundException e) {
			System.out.println("Erro durante a geração do arquivo: " + e.getMessage());
		}
	}
	

}
