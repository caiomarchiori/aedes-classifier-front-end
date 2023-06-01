package Model;

import java.io.Serializable;

public class Item implements Serializable{

	private static final long serialVersionUID = 3282821309257599875L;

	private final long Codigo;
	private final String descricao;
	private final double preco;

	public Item(long codigo, String descricao, double preco) {
		this.Codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public long getCodigo() {
		return Codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}