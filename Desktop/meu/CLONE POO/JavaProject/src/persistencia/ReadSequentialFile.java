package persistencia;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import Model.Acomodacao;
import Model.Checkout;
import Model.Hospede;
import Model.Item;
import Model.Pagamento;
import Model.TipoAcomodacao;

public class ReadSequentialFile {
	
	private ObjectInputStream input;
	
	public boolean openFile(String filename){
		try {
			input = new ObjectInputStream(new FileInputStream(filename));
		}
		catch(IOException ioException){
			System.out.println("Erro ao abrir o arquivo");
			return false;
		}
		return true;
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
	
	public ArrayList<Item> readRecordsItens() throws IOException {
		ArrayList<Item> itens = new ArrayList<>();
		try {
			Item obj = null;
			while ((obj = (Item) input.readObject()) != null) {
				System.out.println("Entrou\n");
				itens.add(obj);
			}
		}
		catch(EOFException endOfFileException) {
			return itens;
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
		return itens;
	}
	
	public ArrayList<Hospede> readRecordsHospedes() throws IOException {
		ArrayList<Hospede> hospedes = new ArrayList<>();
		try {
			Hospede obj = null;
			while ((obj = (Hospede) input.readObject()) != null) {
				System.out.println("Entrou\n");
				hospedes.add(obj);
			}
		}
		catch(EOFException endOfFileException) {
			return hospedes;
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
		return hospedes;
	}
	
	public ArrayList<TipoAcomodacao> readRecordsTipoAcomodacao() throws IOException {
		ArrayList<TipoAcomodacao> tipoAcomodacoes = new ArrayList<>();
		try {
			TipoAcomodacao obj = null;
			while ((obj = (TipoAcomodacao) input.readObject()) != null) {
				System.out.println("Entrou\n");
				tipoAcomodacoes.add(obj);
			}
		}
		catch(EOFException endOfFileException) {
			return tipoAcomodacoes;
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
		return tipoAcomodacoes;
	}
	
	public ArrayList<Acomodacao> readRecordsAcomodacao() throws IOException {
		ArrayList<Acomodacao> acomodacoes = new ArrayList<>();
		try {
			Acomodacao obj = null;
			while ((obj = (Acomodacao) input.readObject()) != null) {
				System.out.println("Entrou\n");
				acomodacoes.add(obj);
			}
		}
		catch(EOFException endOfFileException) {
			return acomodacoes;
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
		return acomodacoes;
	}
	
	public ArrayList<Checkout> readRecordsCheckout() throws IOException {
		ArrayList<Checkout> checkouts = new ArrayList<>();
		try {
			Checkout obj = null;
			while ((obj = (Checkout) input.readObject()) != null) {
				System.out.println("Entrou\n");
				checkouts.add(obj);
			}
		}
		catch(EOFException endOfFileException) {
			return checkouts;
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
		return checkouts;
	}
	
	public ArrayList<Pagamento> readRecordsPagamento() throws IOException {
		ArrayList<Pagamento> pagamentos = new ArrayList<>();
		try {
			Pagamento obj = null;
			while ((obj = (Pagamento) input.readObject()) != null) {
				System.out.println("Entrou\n");
				pagamentos.add(obj);
			}
		}
		catch(EOFException endOfFileException) {
			return pagamentos;
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
		return pagamentos;
	}
	
}
