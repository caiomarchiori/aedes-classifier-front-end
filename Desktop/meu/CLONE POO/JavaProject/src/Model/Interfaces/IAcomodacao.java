package Model.Interfaces;
import Model.Acomodacao;

public interface IAcomodacao {
	int getNumero();

	int getOcupacaoMax();

	void setEstadoOcupacao(Acomodacao.EEstadoOcupacao e);

	Acomodacao.EEstadoOcupacao getEstadoOcupacao();

	String getTipo();

	double getTarifaDiaria();

	double getAdicionalAcompanhante();
}
