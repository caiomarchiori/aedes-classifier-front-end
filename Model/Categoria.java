package Model;
import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable{

	private static final long serialVersionUID = -4951701508964445576L;

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