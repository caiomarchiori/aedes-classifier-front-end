package Model;

import Model.Interfaces.IAcomodacao;

import java.io.Serializable;

public class Acomodacao implements IAcomodacao , Serializable {

	private static final long serialVersionUID = -9072030776421927353L;

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
		DISPONIVEL,
		OCUPADO,
		MANUTENCAO;

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

	public int getOcupacaoMax() {
		return ocupacaoMaxima;
	}

	public String getTipo() {
		return tipoAcomodacao.getNome();
	}

	public double getTarifaDiaria() {
		return tipoAcomodacao.getTarifaDiaria();
	}

	public double getAdicionalAcompanhante() {
		return tipoAcomodacao.getAdicionalAcompanhante();
	}
}