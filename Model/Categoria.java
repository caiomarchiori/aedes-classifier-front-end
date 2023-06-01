package Model;
import java.util.ArrayList;

public class Categoria {
	
	private final String Nome;
	ArrayList<Item> itens = new ArrayList<>();

	public Categoria(String nome) {
		this.Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void addItem(Item item) {
		itens.add(item);
	}

	public void removeItem(Item item) {
		itens.remove(item);
	}
	
}