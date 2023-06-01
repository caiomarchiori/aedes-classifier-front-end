package Model;
import java.util.Random;
import Model.Interfaces.IHospede;

public class Hospede implements IHospede {

	private final long cpf;
	private String nome;
	private String email;
	private long telefone;

	public Hospede(long cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome; 
	}
	
	public long getCpf() {
		return cpf;
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
}