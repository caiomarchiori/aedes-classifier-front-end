package Model;
import java.io.Serializable;
import Model.Interfaces.IHospede;

public class Hospede implements IHospede, Serializable {

	private static final long serialVersionUID = 832751688915265855L;

	private final long cpf;
	private final String nome;
	private String email;
	private long telefone;

	public Hospede(long cpf, String nome,String email,long telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public long getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public long getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
}