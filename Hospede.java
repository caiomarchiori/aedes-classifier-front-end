//@Entity
public class Hospede implements IHospede{
	//@Cpf
	private final long Cpf;
	private String nome;
	private String email;
	private long telefone;
	
	public Hospede() {
		
	}

	public Hospede(long cpf, String nome) {
		this.Cpf = cpf;
		this.nome = nome;
	}


	public long getCpf() {
		return Cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public long getcpf() {
		return this.Cpf;
	}
}