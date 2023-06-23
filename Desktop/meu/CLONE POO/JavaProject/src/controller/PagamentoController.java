package controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.Pagamento;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class PagamentoController {

	ReadSequentialFile application = new ReadSequentialFile();
	ArrayList<Pagamento> pagamentos;
	String filename = "pagamentos.bin";
	
	public PagamentoController(){
		
		if(!application.openFile(filename)) {
			CreateSequentialFile fl = new CreateSequentialFile();
			fl.openFile(filename);
			fl.closeFile();
		};
		try {
			pagamentos = application.readRecordsPagamento();
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
	
	/*methods*/
}
