package Executavel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Dto.LineDTO;
import viewModel.ControleExcelViewModelMapper;

public class LeitorExecutavel {

	public static void main(String[] args) throws IOException {
		String caminho = "C:/Dev/Logs.csv";
		
		BufferedReader conteudoArquivo = null;
		String linha = "";
		String separador = ";";
		List<LineDTO> linhasPlanilha = new ArrayList<LineDTO>();
		try {
			conteudoArquivo = new BufferedReader(new FileReader(caminho));
			while((linha = conteudoArquivo.readLine()) != null) {
				String[] log = linha.split(separador);	
				LineDTO itemPaser = ControleExcelViewModelMapper.to(log);
				linhasPlanilha.add(itemPaser);
			}
			
		} catch (Exception e) {
			
		}
		conteudoArquivo.close();
	}



}

