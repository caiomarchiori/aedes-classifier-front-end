package Model;
import java.io.Serializable;
import java.util.Date;

public class Pagamento implements Serializable{
	
	private static final long serialVersionUID = 1161873237307073124L;

	private final ETipoPagamento tipo;
	private final Date data = new Date();
	private final double valor;

	public Pagamento(int Id, ETipoPagamento tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public ETipoPagamento getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}	
	
	public enum ETipoPagamento {
		PIX("Pix"),
		DEBITO("Débito"),
		CREDITO("Crédito");

		private String descricao;

		private ETipoPagamento(String descricao) {
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
	}
}