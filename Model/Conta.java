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
	
	//ACERTAR COM AS QUANTIDADES DE CADA ITEM
	public double getTotal() {
		double sum = 0;
		for (ItemConta itemConta : itens) {
			sum += itemConta.getPreco();
		}
		return sum;
	}

	public StringBuilder listar(){
		StringBuilder sb = new StringBuilder();
		sb.append("Total da conta: ");
		sb.append(this.getTotal());
		sb.append("\n");
		
		sb.append("Listagem de itens consumidos: ");
		for (ItemConta itemConta : itens) {
			sb.append(itemConta.getItem().getDescricao());
			sb.append("\n");
			sb.append("Quantidade: ");
			sb.append(itemConta.getQtde());
			sb.append("\n");
			sb.append("Preco por unidade: ");
			sb.append(itemConta.getPreco());
			sb.append("\n");
		}
		return sb;
	}
}