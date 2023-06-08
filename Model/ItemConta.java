package Model;
import java.io.Serializable;
import java.util.Date;

public class ItemConta implements Serializable{
	
	private static final long serialVersionUID = -9183313291799838201L;

	private final Date dataHora = new Date();
	private double preco;
	private int qtde = 1;

	private Item item;

	public ItemConta(Item item) {
		this.item = item;
		this.preco = item.getPreco();
	}
	
	public ItemConta(Item item, int qtde) {
		this(item);
		this.qtde = qtde;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public double getPreco() {
		return preco;
	}

	public int getQtde() {
		return qtde;
	}
	
	public double getTotal() {
		return getPreco()*getQtde();
	}
	
	public Item getItem() {	
		return item;
	}
}
