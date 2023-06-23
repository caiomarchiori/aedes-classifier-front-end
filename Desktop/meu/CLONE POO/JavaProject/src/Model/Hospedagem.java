package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import Model.Acomodacao.EEstadoOcupacao;
import Model.Interfaces.IAcomodacao;
import Model.Interfaces.IConta;
import Model.Interfaces.IHospede;

public class Hospedagem implements Serializable{

	private static final long serialVersionUID = 484748652502511402L;
	
	static int numHospedagens = 0;
	private final String id; // random id
	private static int inicioCheckin = 13;
	private static int limiteCheckout = 12;
	private Date checkin = new Date();
	private Date checkout = null;

	
	private final IConta conta;
	private final IAcomodacao acomodacao;
	private final IHospede hospede;

	private ArrayList<IHospede>acompanhantes = new ArrayList<>();
	private ArrayList<Pagamento>pagamentos = new ArrayList<>();
		
	public Hospedagem(String id, IAcomodacao acomodacao, IHospede hospede){
		this.id = java.util.UUID.randomUUID().toString();
		this.acomodacao = acomodacao;
		numHospedagens++;
        this.conta = new Conta(numHospedagens);
		this.hospede = hospede;
	}

	public void fazerCheckin() {
		@SuppressWarnings("deprecation")
		int hora = this.getCheckin().getHours();
		if(hora<Hospedagem.inicioCheckin) {
			System.out.println("Checkin indisponível no momento, volte novamente apartir das " + Hospedagem.inicioCheckin + " horas\n"); // vai ter que substituir por uma excessão depois.
			return;
		}
		
		if(acomodacao.getEstadoOcupacao() == EEstadoOcupacao.DISPONIVEL && acomodacao.getOcupacaoMax()<=acompanhantes.size()) {
			acomodacao.setEstadoOcupacao(EEstadoOcupacao.OCUPADO);
		}		
		else {
			//tratar exceções tamanho e indiponivel.
			return;
		}
		
	}
	
	/*
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	*/
	
	public void addPagamentos(Pagamento pagamento) {
		pagamentos.add(pagamento);
	}
	
	public void addAcompanhantes(IHospede hospede) {
		acompanhantes.add(hospede);
	}

	public String listarHospedagem() {
		StringBuilder sb = new StringBuilder();
		sb.append("Acomodacao escolhida: ");
		sb.append(this.getAcomodacao());
		sb.append("\n");
		
		sb.append("Data do Checkin: ");
		sb.append(this.getCheckin());
		sb.append("\n");
		
		sb.append("Data do Checkout: ");
		sb.append(this.getCheckout());
		sb.append("\n");
		
		sb.append("Lista de hospedes: ");
		sb.append("\n");
		for (IHospede iHospede : acompanhantes) {
			sb.append(iHospede.getNome());
			sb.append(" - ");
			sb.append(iHospede.getCpf());
			sb.append("\n");
		}
		
		sb.append("Total da conta: ");
		sb.append(this.getConta().getTotal());
		sb.append("\n");

		return sb.toString();
	}

	public int getInicioCheckin() {
		return inicioCheckin;
	}

	public int getLimiteCheckout() {
		return limiteCheckout;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
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