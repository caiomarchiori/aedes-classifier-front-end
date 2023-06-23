package Model;

import java.io.Serializable;
import java.util.Date;

public class Checkout implements Serializable{
	
	private static final long serialVersionUID = -4825809890768138773L;
	
	private final Hospedagem hospedagem;
	private final Date checkout;
	
	public Checkout(Hospedagem hospedagem) {
		this.checkout = new Date();
		this.hospedagem = hospedagem;
	}
	
	public Date getCheckout() {
		return checkout;
	}
	
	public Hospedagem getHospedagem() {
		return hospedagem;
	}
	
	/*
	public void fazerCheckout() {
		@SuppressWarnings("deprecation")
		int hora = this.getCheckout().getHours();
		int tempo = this.getCheckout().getDate() - this.getCheckin().getDate(); //arrumar para meses.
		if(hora>Hospedagem.limiteCheckout) {
			double valor = (tempo + 1)*(acomodacao.getTarifaDiaria() + acomodacao.getAdicionalAcompanhante());
			//implementar pagamento.
		}
		
	}
	*/
}
