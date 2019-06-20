package java.br.com.ap220191.ec05_datacar.model.Pessoa;
import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private Date dataNas;
	private String sexo;
	private String email;
	private long telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNas() {
		return dataNas;
	}
	public void setDataNas(Date dataNas) {
		this.dataNas = dataNas;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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

