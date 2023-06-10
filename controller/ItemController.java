package controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.Item;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class ItemController {
	ReadSequentialFile application = new ReadSequentialFile();
	ArrayList<Item> itens;
	
	public ItemController() throws IOException{
		CreateSequentialFile fl = new CreateSequentialFile();
		String filename = "itens.bin";
		
		try {
			fl.openFile(filename);
			fl.addRecords();
			fl.closeFile();
			application.openFile(filename);
			itens = application.readRecordsItens();
			
			for (Item item : itens) {
				System.out.println(item.getCodigo());
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
}