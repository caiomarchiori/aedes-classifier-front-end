import java.util.Date;

//@Entity
public class ItemConta {
	//@Id
	int Id;
	private final Date dataHora = new Date();
	private final double preco;
	private final int qtde;
	
	private Item item;

	public ItemConta(int Id, double preco, int qtde) {
		this.Id = Id;
		this.preco = preco;
		this.qtde = qtde;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
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
