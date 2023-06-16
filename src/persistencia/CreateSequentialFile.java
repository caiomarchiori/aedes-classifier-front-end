package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Model.Item;

public class CreateSequentialFile {
	
	private ObjectOutputStream output;
	
	public void openFile(String filename) {
		try {
			output = new ObjectOutputStream(new FileOutputStream(filename));
		}
		catch(IOException ioException){
			System.out.println("Erro ao abrir o arquivo");
		}
	}
	
	public void closeFile(){
		try {
			if(output!=null) 
				output.close();
		}
		catch(IOException ioException){
			System.err.print("Erro ao fechar o arquivo\n");
		}
	}
	
	public void addRecords(ArrayList<Item> itens) throws IOException{
		
		try {
			for (Item item : itens) {
				output.writeObject(item);
			}
		}
		
		catch(IOException ioException) {
			System.err.print("Erro ao escrever no arquivo\n");
			throw ioException;
		}
		catch(NoSuchElementException elementException) {
			System.err.println("Tente novamente");
		}
	}
	
	
}
