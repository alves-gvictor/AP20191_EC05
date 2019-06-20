package Pessoa;

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
}
