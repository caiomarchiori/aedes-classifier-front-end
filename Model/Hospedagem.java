package Model;
import java.util.ArrayList;
import java.util.Date;

import Model.Interfaces.IAcomodacao;
import Model.Interfaces.IConta;
import Model.Interfaces.IHospede;

public class Hospedagem {
	private int inicioCheckin = 13;
	private int inicioCheckout = 12;
	private final String id; // uuid
	private Date Checkin = new Date();
	private Date Checkout = new Date();

	private IConta conta;
	private Pagamento pagamento;
	private IAcomodacao acomodacao;
	private IHospede hospede;

	ArrayList<IHospede> hospedes = new ArrayList<>();

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