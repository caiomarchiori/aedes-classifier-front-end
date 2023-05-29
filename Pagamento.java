import java.util.Date;

//@Entity
public class Pagamento {
	//@Id
	int Id;
	private final ETipoPagamento tipo;
	private final Date data = new Date();
	private final double valor;
	
	public Pagamento() {
		
	}

	public Pagamento(int Id, ETipoPagamento tipo, double valor) {
		this.Id = Id;
		this.tipo = tipo;
		this.valor = valor;
	}
}