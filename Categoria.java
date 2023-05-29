import java.util.ArrayList;
//@Entity
public class Categoria {
	//@Nome
	private final String Nome;
	
	ArrayList<Item>itens = new ArrayList<>();

	public Categoria(String nome) {
		this.Nome = nome;
	}

	public String getNome() {
		return Nome;
	}
	
	public void addIten(Item item) {
		itens.add(item);
	}
	
	public void removeIten(Item item) {
		itens.remove(item);
	}
}