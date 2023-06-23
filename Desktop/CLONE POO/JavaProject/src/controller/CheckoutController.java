package controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.Checkout;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class CheckoutController {

		ReadSequentialFile application = new ReadSequentialFile();
		ArrayList<Checkout> checkouts;
		String filename = "checkouts.bin";
		
		public CheckoutController(){
			
			if(!application.openFile(filename)) {
				CreateSequentialFile fl = new CreateSequentialFile();
				fl.openFile(filename);
				fl.closeFile();
			};
			try {
				
				checkouts = application.readRecordsCheckout();
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
		
		/*methods*/
		
		
		
}
