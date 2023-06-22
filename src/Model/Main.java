package Model;

import java.io.IOException;
import java.util.ArrayList;

import controller.ItemController;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;

public class Main {

	public static void main(String[] args){

		// AREA DE TESTES
		// System.out.println( EEstadoOcupacao.OCUPADO.getEstadoOcupacao());//PRINTA O
		// NUMERO EM ORDEM
		//ViewJ view = new ViewJ();
		//view.initialize();
		// Categoria.listarCatalogo(); //TESTAR DPS
		//Item item1 = new Item("Nome item",123l,"Descricao item",120.50);
		//Categoria c1 = new Categoria("Categoria_nome");
		//c1.addItem(item1);
		
		try {
			ItemController itemController = new ItemController();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
