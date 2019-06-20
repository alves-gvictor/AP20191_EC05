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

}
