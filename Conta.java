import java.util.ArrayList;

//@Entity
public class Conta implements IConta{
	//@Id
	int Id;
	
	ArrayList<ItemConta>itens = new ArrayList<>();
	
	public Conta (int Id) {
		this.Id = Id;
	}
	
	//CORRIGIR
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

	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();
		return sb;
	}
}