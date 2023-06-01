package Model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import Model.Interfaces.IAcomodacao;
import Model.Interfaces.IConta;
import Model.Interfaces.IHospede;

public class Hospedagem {
	private final String id; // random id
	private static int inicioCheckin = 13;
	private static int inicioCheckout = 12;
	private Date Checkin = new Date();
	private Date Checkout = new Date();
	
	
	private IConta conta;
	private Pagamento pagamento;
	private IAcomodacao acomodacao;
	private IHospede hospede;

	ArrayList<IHospede> hospedes = new ArrayList<>();
	
	public Hospedagem(String id, IConta conta, Pagamento pagamento, IAcomodacao acomodacao, IHospede hospede)
		this.id = java.util.UUID.randomUUID().toString();
		this.conta = conta;
		this.pagamento = pagamento;
		this.acomodacao = acomodacao;
		this.hospede = hospede;
		this.hospedes = hospedes;
	}

	public Hospedagem(String id) {
		this.id = id;
	}

	public void addAcompanhantes(IHospede hospede) {
		hospedes.add(hospede);
	}

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

	public void setConta(IConta conta) {
		this.conta = conta;
	}

	public String getId() {
		return id;
	}
}