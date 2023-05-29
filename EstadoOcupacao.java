
public enum EstadoOcupacao implements EEstadoOcupacao{
	DISPONIVEL,
	OCUPADO,
	MANUTENCAO;

	public int getEstadoOcupacao() {
		return ordinal() + 1; //retorna em forma de inteiro
	}
}
