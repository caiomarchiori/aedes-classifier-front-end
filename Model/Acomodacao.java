package Model;

import Model.Interfaces.IAcomodacao;

public class Acomodacao implements IAcomodacao {

	private final int numero;
	private final int ocupacaoMaxima;
	private final TipoAcomodacao tipoAcomodacao;
	private EEstadoOcupacao estadoOcupacao;

	public Acomodacao(int numero, int ocupacaoMaxima, TipoAcomodacao tipoAcomodacao) {
		this.numero = numero;
		this.ocupacaoMaxima = ocupacaoMaxima;
		this.tipoAcomodacao= tipoAcomodacao;
		setEstadoOcupacao(EEstadoOcupacao.DISPONIVEL);
	}

	public enum EEstadoOcupacao {
		DISPONIVEL, OCUPADO, MANUTENCAO;

		public int getEstadoOcupacao() {
			return ordinal();
		}
	}

	public EEstadoOcupacao getEstadoOcupacao() {
		return estadoOcupacao;
	}

	public void setEstadoOcupacao(EEstadoOcupacao estadoOcupacao) {
		this.estadoOcupacao = estadoOcupacao;
	}

	public int getNumero() {
		return numero;
	}

	public int getOcupacaoMaxima() {
		return ocupacaoMaxima;
	}

	public int getOcupacaoMax() {
		return 0;
	}

	public String getTipo() {
		return tipoAcomodacao.getNome();
	}

	public double getTarifaDiaria() {
		return tipoAcomodacao.getTarifaDiaria();
	}

	public double getAdicionalIAcompanhante() {
		return tipoAcomodacao.getAdicionalAcompanhante();
	}
}