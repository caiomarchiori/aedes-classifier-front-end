package controller;

import java.io.IOException;
import java.util.ArrayList;

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
			
			for (Item item : itens) {
				System.out.println(item.getNome());
				System.out.println(item.getCodigo());
				System.out.println(item.getDescricao());
				System.out.println(item.getPreco());
			}
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
	
	public void adicionarItem(Item item) { //apenas para teste.
		try {
			CreateSequentialFile fl = new CreateSequentialFile();
			itens.add(item);
			fl.openFile(filename);
			fl.addRecords(itens);
			fl.closeFile();
		}
		catch(Exception exx) {
			exx.getMessage();
		}
	}
	
	
}