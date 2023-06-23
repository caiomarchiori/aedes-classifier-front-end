package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Acomodacao;
import Model.TipoAcomodacao;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class AcomodacaoController {

	ReadSequentialFile application = new ReadSequentialFile();
	ArrayList<TipoAcomodacao> tipoAcomodacoes;
	ArrayList<Acomodacao> acomodacoes;

	String filename = "tipoAcomodacao.bin";
	String filename2 = "Acomodacao.bin";
	
	public AcomodacaoController(){
		
		if(!application.openFile(filename)) {
			CreateSequentialFile fl = new CreateSequentialFile();
			fl.openFile(filename);
			fl.closeFile();

		if(!application.openFile(filename2)) {
			CreateSequentialFile f2 = new CreateSequentialFile();
			f2.openFile(filename2);
			f2.closeFile();
		}
			
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
		
		try {
			acomodacoes = application.readRecordsAcomodacao();
		}
		catch(IOException e) {
			System.err.println(filename2);
			e.printStackTrace();
		}
		finally {
			try {
				application.closeFile();
			}
			catch(IOException e) {
				System.err.println(filename2);
				e.printStackTrace();
			}
		}		
	}
	
	public TipoAcomodacao buscarTipoAcomodacao(String nome) {
		for (TipoAcomodacao tipoAcomodacao : tipoAcomodacoes) {
			if(tipoAcomodacao.getNome().compareTo(nome)==0) {
				return tipoAcomodacao;
			}
		}
		return null;
	}
	
	/*
	public Acomodacao buscarAcomodacao(String numero) {
		//int numero_ = Integer.parseInt(numero);
		long numero_ = Long.parseLong(numero);
		for (Acomodacao acomodacao : acomodacoes) {
			if(acomodacao.getNumero() == numero_){
				return acomodacao;
			}
		}
		return null;
	}
	*/
	
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
	
	/*
	public void editarAcomodacao(String numero) {
		Long numero_ = Long.parseLong(numero);
		for (Acomodacao acomodacao : acomodacoes) {
			if(acomodacao.getNumero() == numero_) {
				CreateSequentialFile f2 = new CreateSequentialFile();
				fl.openFile(filename2);
				try {
					f2.addRecordsAcomodacao(acomodacoes);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fl.closeFile();
			}
		}
		
	}
	*/
	
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
	
	
	/*
	public void adicionarAcomodacao(String numero, String ocupacaoMaxima, String tipo) {
		//PASSAR OS LONGS PRA INT
		try {
			long numero_ = Long.parseLong(numero);
			long ocupacaoMaxima_ = Long.parseLong(ocupacaoMaxima);
			
			Integer numero2 = Integer.parseInteger(numero);
			
			for (TipoAcomodacao tipoAcomodacao : tipoAcomodacoes) {
				if(tipoAcomodacao.getNome().compareTo(tipo) == 0) {
					Acomodacao acomodacao = new Acomodacao(numero_,ocupacaoMaxima_,tipoAcomodacao);
				}
			}
			//CreateSequentialFile f2 = new CreateSequentialFile();
			//acomodacoes.add(acomodacao);
			//f2.openFile(filename2);
			//f2.addRecordsAcomodacao(acomodacoes);
			//f2.closeFile();
		}
		catch(Exception exx) {
			exx.getMessage();
		}
	}
	*/

	public void apagarTipoAcomodacao(String nome) { //apenas para teste.
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
	
	/*
	public void apagarAcomodacao(String numero) { //apenas para teste.
		Long numero_ = Long.parseLong(numero);
		try {			
			for (Acomodacao acomodacao : acomodacoes) {
				if(acomodacao.getNumero() == numero_) {
					acomodacoes.remove(acomodacao);
				}
			}
		}
		catch(Exception exx) {
			System.out.println(exx.getMessage());
			System.out.println("Excessão");
			exx.getMessage();
		}
		finally {
			CreateSequentialFile f2 = new CreateSequentialFile();
			f2.openFile(filename2);
			try {
				f2.addRecordsAcomodacao(acomodacoes);
			} catch (IOException e) {
				e.printStackTrace();
			}
			f2.closeFile();
		}
	}
	*/
	
	public List<String> getTiposAcomodacao() {
		
		List<String> lista = new ArrayList<>();

		for (TipoAcomodacao tipo : tipoAcomodacoes)
			lista.add(String.format("%s\t%.2f\t%.2f", tipo.getNome(), tipo.getTarifaDiaria(), tipo.getAdicionalAcompanhante()));

		return lista;
	}
	
	public List<String> getAcomodacoes() {
		
		List<String> lista = new ArrayList<>();

		for (Acomodacao acomodacao : acomodacoes)
			lista.add(String.format("%d\t%.2f\t%.2f\t%d\t%d", acomodacao.getNumero(),acomodacao.getTarifaDiaria(),acomodacao.getAdicionalAcompanhante(),acomodacao.getNumero(),acomodacao.getOcupacaoMax()));

		return lista;
	}
	
	/*
	public String listarTipoAcomodacoes() {
		StringBuilder sb = new StringBuilder();
		for (TipoAcomodacao tipo : tipoAcomodacoes) {
			sb.append(tipo.getNome() + " ");
			sb.append(tipo.getAdicionalAcompanhante() + "\n");
			sb.append(tipo.getTarifaDiaria() + "\n");
		}
		return sb.toString();
	}
	*/
}