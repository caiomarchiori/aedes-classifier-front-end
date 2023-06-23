package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Model.Item;
import Model.TipoAcomodacao;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class AcomodacaoController {

	ReadSequentialFile application = new ReadSequentialFile();
	ArrayList<TipoAcomodacao> tipoAcomodacoes;
	String filename = "tipoAcomodacao.bin";
	
	public AcomodacaoController(){
		
		if(!application.openFile(filename)) {
			CreateSequentialFile fl = new CreateSequentialFile();
			fl.openFile(filename);
			fl.closeFile();
		};
		try {
			tipoAcomodacoes = application.readRecordsTipoAcomodacao();
	
		}
		catch(IOException e) {
			System.err.println(filename);
			e.printStackTrace();
		}
		finally {
			try {
				application.closeFile();
			}
			catch(IOException e) {
				System.err.println(filename);
				e.printStackTrace();
			}
		}		
	}
	
	public TipoAcomodacao buscarAcomodacao(String nome) {
		for (TipoAcomodacao tipoAcomodacao : tipoAcomodacoes) {
			if(tipoAcomodacao.getNome().compareTo(nome)==0) {
				return tipoAcomodacao;
			}
		}
		return null;
	}
	
	public void editarTipoAcomodacao(String nome, String tarifaDiaria, String adicionalAcompanhante) {
		Double tarifaDiaria_ = Double.parseDouble(tarifaDiaria);
		Double adicionalAcompanhante_ = Double.parseDouble(adicionalAcompanhante);
		
		for (TipoAcomodacao tipoAcomodacao : tipoAcomodacoes) {
			if(tipoAcomodacao.getNome().compareTo(nome) == 0) {
				tipoAcomodacao.setAdicionalAcompanhante(adicionalAcompanhante_);
				tipoAcomodacao.setTarifaDiaria(tarifaDiaria_);
				CreateSequentialFile fl = new CreateSequentialFile();
				fl.openFile(filename);
				try {
					fl.addRecordsTipoAcomodacao(tipoAcomodacoes);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fl.closeFile();
			}
		}
		
	}
	
	public void adicionarTipoAcomodacao(String nome, String tarifaDiaria, String adicionalAcompanhante) {
		try {
			double tarifaDiaria_ = Double.parseDouble(tarifaDiaria);
			double adicionalAcompanhante_ = Double.parseDouble(adicionalAcompanhante);
			TipoAcomodacao tipoAcomodacao = new TipoAcomodacao(nome,tarifaDiaria_,adicionalAcompanhante_);
			CreateSequentialFile fl = new CreateSequentialFile();
			tipoAcomodacoes.add(tipoAcomodacao);
			fl.openFile(filename);
			fl.addRecordsTipoAcomodacao(tipoAcomodacoes);
			fl.closeFile();
		}
		catch(Exception exx) {
			exx.getMessage();
		}
	}
	
	public void apagarTipoAcomodacao(String nome) {
		try {			
			for (TipoAcomodacao tipoAcomodacao : tipoAcomodacoes) {
				if(tipoAcomodacao.getNome().compareTo(nome)==0) {
					tipoAcomodacoes.remove(tipoAcomodacao);
				}
			}
		}
		catch(Exception exx) {
			System.out.println(exx.getMessage());
			System.out.println("Excessão");
			exx.getMessage();
		}
		finally {
			CreateSequentialFile fl = new CreateSequentialFile();
			fl.openFile(filename);
			try {
				fl.addRecordsTipoAcomodacao(tipoAcomodacoes);
			} catch (IOException e) {
				e.printStackTrace();
			}
			fl.closeFile();
		}
	}
	
	public List<String> getTiposAcomodacao() {
		
		List<String> lista = new ArrayList<>();

		for (TipoAcomodacao tipo : tipoAcomodacoes)
			lista.add(String.format("%s\t%.2f\t%.2f", tipo.getNome(), tipo.getTarifaDiaria(), tipo.getAdicionalAcompanhante()));

		return lista;
	}
	
	/*
	public String listarItens() {
		StringBuilder sb = new StringBuilder();
		for (Item item : itens) {
			sb.append(item.getDescricao() + " ");
			sb.append(item.getPreco() + "\n");
		}
		return sb.toString();
	}	
	**/
}