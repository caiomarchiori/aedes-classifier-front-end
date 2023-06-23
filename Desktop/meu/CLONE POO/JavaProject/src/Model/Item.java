package Model;

import java.io.Serializable;

public class Item implements Serializable{

	private static final long serialVersionUID = 3282821309257599875L;

	private final long codigo;
	private String nome;
	private String descricao;
	private double preco;

	public Item(String nome, long codigo, String descricao, double preco) {
		this.codigo = codigo;
		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
}