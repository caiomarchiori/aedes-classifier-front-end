package persistencia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import Model.Acomodacao;
import Model.Checkout;
import Model.Hospede;
import Model.Item;
import Model.Pagamento;
import Model.TipoAcomodacao;

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
	
	public void addRecordsTipoAcomodacao(ArrayList<TipoAcomodacao> tipoAcomodacoes) throws IOException{
		
		try {
			for (TipoAcomodacao tipoAcomodacao : tipoAcomodacoes) {
				output.writeObject(tipoAcomodacao);
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
	
	public void addRecordsAcomodacao(ArrayList<Acomodacao> acomodacoes) throws IOException{
		
		try {
			for (Acomodacao acomodacao : acomodacoes) {
				output.writeObject(acomodacao);
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
	
	public void addRecordsHospedes(ArrayList<Hospede> hospedes) throws IOException{
		
		try {
			for (Hospede hospede : hospedes) {
				output.writeObject(hospede);
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
	
	public void addRecordsCheckout(ArrayList<Checkout> checkouts) throws IOException{
		
		try {
			for (Checkout checkout : checkouts) {
				output.writeObject(checkout);
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
	
	public void addRecordsPagamento(ArrayList<Pagamento> pagamentos) throws IOException{
		
		try {
			for (Pagamento pagamento : pagamentos) {
				output.writeObject(pagamento);
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
