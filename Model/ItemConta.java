package Model;
import java.io.Serializable;
import java.util.Date;

public class ItemConta implements Serializable{
	
	private static final long serialVersionUID = -9183313291799838201L;

	private final Date dataHora = new Date();
	private final double preco;
	private final int qtde;

	private Item item;

	public ItemConta(double preco, int qtde) {
		this.preco = preco;
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
}
