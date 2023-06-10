package persistencia;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;

import Model.Item;

public class ReadSequentialFile {
	
	private ObjectInputStream input;
	
	public void openFile(String filename) throws IOException {
		try {
			input = new ObjectInputStream(new FileInputStream(filename));
		}
		catch(IOException ioException){
			System.err.println("Erro ao abrir o arquivo: ");
			throw ioException;
		}
	}
	
	public void closeFile() throws IOException{
		try {
			if(input!=null) 
				input.close();
		}
		catch(IOException ioException) {
			System.err.println("Erro ao fechar o arquivo: ");
			throw ioException;
		}
	}
	
	public void readRecords() throws IOException {
		Item item;
		try {
			item = (Item) input.readObject();
		}
		catch(EOFException endOfFileException) {
			return;
		}
		catch(ClassNotFoundException classNotFoundException){
			System.err.print("Classe incompativel para desserialização.");
			System.exit(1);
		}
		catch(InvalidClassException invalidClassException) {
			System.err.print("Classe incompatível para desserialização");
			System.exit(1);
		}
		catch(IOException ioExeception) {
			System.err.print("Erro de leitura do arquivo: ");
			throw ioExeception;
		}
	}
	
}
