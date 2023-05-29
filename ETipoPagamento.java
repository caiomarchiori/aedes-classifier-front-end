
public enum ETipoPagamento {
	PIX("pix"),
	DEBITO("debito"),
	CREDITO("credito");

	private String descricao;

	private ETipoPagamento(String descricao) { // sempre privado
		this.descricao = descricao;
	}

	public String getDescricao(){
		return descricao;
	}
}
