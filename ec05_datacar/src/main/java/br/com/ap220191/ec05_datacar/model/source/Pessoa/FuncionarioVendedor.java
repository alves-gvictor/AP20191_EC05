package java.br.com.ap220191.ec05_datacar.model.Pessoa;

public class FuncionarioVendedor extends Pessoa{
	private int matricula;
	private int salario;
	private double comissao;
	private double valorVendido;
	
	
	public void calcularSalario{
		comissao = (valorVendido*15/100);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getValorVendido() {
		return valorVendido;
	}
	public void setValorVendido(double valorVendido) {
		this.valorVendido = valorVendido;
	}

<<<<<<< HEAD
public class FuncionarioVendedor extends Pessoa {
    private long matricula;
    private int quantidade;
    private double comissao;
    private double valorVendido;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public FuncionarioVendedor(String nome, String cpf, String email, String sexo, String data, String numero, long matricula){
        setCpf(cpf);
        setDataNas(data);
        setEmail(email);
        setNome(nome);
        setSexo(sexo);
        setTelefone(numero);
        setMatricula(matricula);

    }

    public String toString(){
        return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nSexo: " + getSexo() + "\nTelefone: " + getTelefone() + "\nMatricula: " + getMatricula();
    }

    public void calcularSalario(){
        comissao = (valorVendido*15/100);
    }
=======
>>>>>>> be7bbd6373a9a898863aeb199c38f368141a4071
}
