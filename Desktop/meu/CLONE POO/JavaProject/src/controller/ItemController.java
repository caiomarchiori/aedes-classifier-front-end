package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Model.Item;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class ItemController {

	ReadSequentialFile application = new ReadSequentialFile();
	ArrayList<Item> itens;
	String filename = "itens.bin";
	
	public ItemController(){
		
		if(!application.openFile(filename)) {
			CreateSequentialFile fl = new CreateSequentialFile();
			fl.openFile(filename);
			fl.closeFile();
		};
		try {
			
			itens = application.readRecordsItens();
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
	
	public Item buscarItemCodigo(String codigo) {
		long codigo_ = Long.parseLong(codigo);
		for (Item item : itens) {
			if(item.getCodigo()==codigo_) {
				return item;
			}
		}
		return null;
	}
	
	public void editarItem(String codigo, String nome, String descricao, String preco) {
		long codigo_ = Long.parseLong(codigo);
		for (Item item : itens) {
			if(item.getCodigo()==codigo_) {
				double preco_ = Double.parseDouble(preco);	
				item.setNome(nome);
				item.setDescricao(descricao);
				item.setPreco(preco_);
				CreateSequentialFile fl = new CreateSequentialFile();
				fl.openFile(filename);
				try {
					fl.addRecords(itens);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				fl.closeFile();
			}
		}
		
	}

	public void adicionarItem(String nome,String codigo,String descricao,String preco) {
		try {
			CreateSequentialFile fl = new CreateSequentialFile();
			Long codigo_ = Long.parseLong(codigo);
			double preco_ = Double.parseDouble(preco);
			Item item = new Item(nome,codigo_,descricao,preco_);
			itens.add(item);
			fl.openFile(filename);
			fl.addRecords(itens);
			fl.closeFile();
		}
		catch(Exception exx) {
			exx.getMessage();
		}
	}
	
	public void removerItem(String codigo) {
		try {
			System.out.println(codigo);
			Long codigo_ = Long.parseLong(codigo);
			
			for (Item item : itens) {
				if(item.getCodigo()==codigo_) {
					System.out.println("é igual\n");
					itens.remove(item);
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
				fl.addRecords(itens);
			} catch (IOException e) {
				e.printStackTrace();
			}
			fl.closeFile();
		}
	}
	
	public List<String> getItens() {
		
		List<String> lista = new ArrayList<>();

		for (Item item : itens)
			lista.add(String.format("%s\t%d\t%s\t%.2f", item.getNome(), item.getCodigo(), item.getDescricao(), item.getPreco()));

		return lista;
	}
	
	public String listarItens() {
		StringBuilder sb = new StringBuilder();
		for (Item item : itens) {
			sb.append(item.getDescricao() + " ");
			sb.append(item.getPreco() + "\n");
		}
		return sb.toString();
	}	
}