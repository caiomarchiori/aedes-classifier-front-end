//import javax.persistence.Entity
//import javax.persistence.Id
//@Entity

public class TipoAcomodacao {
	
	//@nome
	private final String nome;
	private double tarifaDiaria;
	private double adicionalAcompanhante;
	
	public TipoAcomodacao(){
		
	}

	public TipoAcomodacao(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public double getTarifaDiaria() {
		return tarifaDiaria;
	}

	public void setTarifaDiaria(double tarifaDiaria) {
		this.tarifaDiaria = tarifaDiaria;
	}

	public double getAdicionalAcompanhante() {
		return adicionalAcompanhante;
	}

	public void setAdicionalAcompanhante(double adicionalAcompanhante) {
		this.adicionalAcompanhante = adicionalAcompanhante;
	}
}