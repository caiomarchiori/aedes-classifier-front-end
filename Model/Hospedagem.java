package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import Model.Interfaces.IAcomodacao;
import Model.Interfaces.IConta;
import Model.Interfaces.IHospede;

public class Hospedagem implements Serializable{

	private static final long serialVersionUID = 484748652502511402L;

	private final String id; // random id
	private static int inicioCheckin = 13;
	private static int inicioCheckout = 12;
	private Date Checkin = new Date();
	private Date Checkout = new Date();

	private final IConta conta;
	private final IAcomodacao acomodacao;
	private final IHospede hospede;

	private ArrayList<IHospede>acompanhantes = new ArrayList<>();
	private ArrayList<Pagamento>pagamentos = new ArrayList<>();
	
	public Hospedagem(String id, IConta conta, IAcomodacao acomodacao, IHospede hospede){
		this.id = java.util.UUID.randomUUID().toString();
		this.conta = conta;
		this.acomodacao = acomodacao;
		this.hospede = hospede;
	}

	public void addPagamentos(Pagamento pagamento) {
		pagamentos.add(pagamento);
	}
	
	public void addAcompanhantes(IHospede hospede) {
		acompanhantes.add(hospede);
	}
	
	//ATUALIZAR PODEMOS LISTAR A ACOMODACAO,OS HOSPEDES (NOME DELES) E TAMBEM O SALDO DA CONTA??
	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();
		return sb;
	}

	public int getInicioCheckin() {
		return inicioCheckin;
	}

	public int getInicioCheckout() {
		return inicioCheckout;
	}

	public Date getCheckin() {
		return Checkin;
	}

	public Date getCheckout() {
		return Checkout;
	}

	public IConta getConta() {
		return conta;
	}

	public String getId() {
		return id;
	}
	
	public IHospede getHospede() {
		return hospede;
	}
	
	public IAcomodacao getAcomodacao() {
		return acomodacao;
	}
}