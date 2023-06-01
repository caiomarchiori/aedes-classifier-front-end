package Model;
import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable{

	private static final long serialVersionUID = -4951701508964445576L;

	private final String Nome;

	static ArrayList<Item> itens = new ArrayList<>();

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

	static String listarCatalogo() {
		StringBuilder sb = new StringBuilder();
		sb.append("--- CATALOGO ---");
		sb.append("\n");
		for (Item item : itens) {
			sb.append("Codigo: ");
			sb.append(item.getCodigo());
			sb.append("\n");
			sb.append("Descricao: ");
			sb.append(item.getDescricao());
			sb.append("\n");
			sb.append("Preco: ");
			sb.append(item.getPreco());
			sb.append("\n");
		}

		return sb.toString();
	}
}