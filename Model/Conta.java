package Model;
import java.io.Serializable;
import java.util.ArrayList;
import Model.Interfaces.IConta;

public class Conta implements IConta, Serializable{
	
	private static final long serialVersionUID = 6143895814781654565L;
	
	private final int Id;
	
	private ArrayList<ItemConta> itens = new ArrayList<>();

	public Conta(int Id) {
		this.Id = Id;
	}
	
	public int getId() {
		return Id;
	}

	// CORRIGIR
	public void addItem(Item item, int qtde) {
		itens.add(null);
	}

	public void removeItem(int index) {
		itens.remove(index);
	}

	public double getTotal() {
		double sum = 0;
		for (ItemConta itemConta : itens) {
			sum += itemConta.getPreco();
		}
		return sum;
	}
	
	//PODEMOS LISTAR O TOTAL ATUAL DA CONTA E OS ITENS E SUAS RESPECTIVAS QUANTIDADES
	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();
		return sb;
	}
}