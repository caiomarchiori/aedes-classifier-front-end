
public interface IAcomodacao {
	int getNumero();
	int getOcupacaoMax();
	void setEstadoOcupacao(EEstadoOcupacao e);
	EEstadoOcupacao getEstadoOcupacao();
	String getTipo();
	double getTarifaDiaria();
	double getAdicionalIAcompanhante();
}
