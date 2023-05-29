
//@Entity

public class Acomodacao implements IAcomodacao{
	//@numero
	private final int numero;
	private final int ocupacaoMaxima;
	private EEstadoOcupacao estadoOcupacao;
	
	public Acomodacao() {
		
	}

	public Acomodacao(int numero, int ocupacaoMaxima) {
		this.numero = numero;
		this.ocupacaoMaxima = ocupacaoMaxima;
	}
	
	//inner class
	public enum EEstadoOcupacao{
		DISPONIVEL,
		OCUPADO,
		MANUTENCAO;

		public int getEstadoOcupacao() {
			return ordinal() ; //retorna em forma de inteiro
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
		return null;
	}

	public double getTarifaDiaria() {
		return 0;
	}
	public double getAdicionalIAcompanhante() {
		return 0;
	}
}