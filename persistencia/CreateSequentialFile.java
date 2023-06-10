package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

import Model.Item;

public class CreateSequentialFile {
	
	private ObjectOutputStream output;
	
	public void openFile(String filename) throws IOException {
		try {
			output = new ObjectOutputStream(new FileOutputStream(filename));
		}
		catch(IOException ioException){
			System.err.print("Erro ao abrir o arquivo\n");
			throw ioException;
		}
	}
	
	public void closeFile() throws IOException {
		try {
			if(output!=null) 
				output.close();
		}
		catch(IOException ioException){
			System.err.print("Erro ao fechar o arquivo\n");
			throw ioException;
		}
	}
	
	public void addRecords() throws IOException{
		
		try {
		Item item; //objeto que será serializado
		item = new Item("Nome item",123l,"Descricao item",120.50);
		output.writeObject(item);
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
