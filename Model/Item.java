package Model;
//@Entity
public class Item {
	// @Codigo
	private final long Codigo;
	private final String descricao;
	private double preco;

	public Item(long codigo, String descricao, double preco) {
		this.Codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getCodigo() {
		return Codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}