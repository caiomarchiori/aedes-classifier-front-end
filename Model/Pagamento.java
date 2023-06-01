package Model;
import java.util.Date;

import Model.Enums.ETipoPagamento;

//@Entity
public class Pagamento {
	// @Id
	int Id;
	private final ETipoPagamento tipo;
	private final Date data = new Date();
	private final double valor;

	public Pagamento(int Id, ETipoPagamento tipo, double valor) {
		this.Id = Id;
		this.tipo = tipo;
		this.valor = valor;
	}
}