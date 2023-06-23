package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Model.Hospede;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class HospedeController {

	ReadSequentialFile application = new ReadSequentialFile();
	ArrayList<Hospede> hospedes;
	String filename = "hospedes.bin";
	
	public HospedeController(){
		
		if(!application.openFile(filename)) {
			CreateSequentialFile fl = new CreateSequentialFile();
			fl.openFile(filename);
			fl.closeFile();
		};
		try {
			
			hospedes = application.readRecordsHospedes();
			/*
			System.out.println("controller");
			for (Item item : itens) {
				System.out.println(item.getNome());
				System.out.println(item.getCodigo());
				System.out.println(item.getDescricao());
				System.out.println(item.getPreco());
			}
			*/
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
	
	public Hospede buscarHospedeCPF(String codigo) {
		long codigo_ = Long.parseLong(codigo);
		for (Hospede hospede : hospedes) {
			if(hospede.getCpf()==codigo_) {
				return hospede;
			}
		}
		return null;
	}
	
	public void editarHospede(String cpf, String email, String telefone) {
		//long cpf, String nome,String email,long telefone
		long cpf_ = Long.parseLong(cpf);
		long telefone_ = Long.parseLong(telefone);
		
		for (Hospede hospede : hospedes) {
			if(hospede.getCpf()==cpf_) {	
				hospede.setEmail(email);
				hospede.setTelefone(telefone_);
				
				CreateSequentialFile fl = new CreateSequentialFile();
				fl.openFile(filename);
				try {
					fl.addRecordsHospedes(hospedes);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fl.closeFile();
			}
		}		
		
	}
	
	public void adicionarHospede(String nome,String cpf,String telefone,String email) { //COLOCAR A CONTA ASSOCIADA????? PROBLEMA,CONTA NAO ESTA ASSOCIADA A HOSPEDE
		try {
			//long cpf, String nome,String email,long telefone
			CreateSequentialFile fl = new CreateSequentialFile();
			Long cpf_ = Long.parseLong(cpf);
			Long telefone_ = Long.parseLong(telefone);
			Hospede hospede = new Hospede(cpf_,nome,email,telefone_);
			hospedes.add(hospede);
			fl.openFile(filename);
			fl.addRecordsHospedes(hospedes);
			fl.closeFile();
		}
		catch(Exception exx) {
			exx.getMessage();
		}
	}
	
	public void removerHospede(String cpf) { //apenas para teste.
		try {
			Long codigo_ = Long.parseLong(cpf);
			
			for (Hospede hospede : hospedes) {
				if(hospede.getCpf()==codigo_) {
					hospedes.remove(hospede);
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
				fl.addRecordsHospedes(hospedes);
			} catch (IOException e) {
				e.printStackTrace();
			}
			fl.closeFile();
		}
	}
	
	public List<String> getHospedes() {
		
		List<String> lista = new ArrayList<>();
		//long cpf, String nome,String email,long telefone
		for (Hospede hospede : hospedes) {
			lista.add(String.format("%d\t%s\t%s\t%d", hospede.getCpf(),hospede.getNome(),hospede.getEmail(),hospede.getTelefone()));
		}
		return lista;
	}
	/**
	public String listarHospedes() {
		StringBuilder sb = new StringBuilder();
		for (Hospede hospede : hospedes) {
			sb.append(hospede.getCpf() + " ");
			sb.append(hospede.getPreco() + "\n");
		}
		return sb.toString();
	}	
	**/
}