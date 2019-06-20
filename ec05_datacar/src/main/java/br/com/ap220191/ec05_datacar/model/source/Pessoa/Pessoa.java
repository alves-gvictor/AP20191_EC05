package Pessoa;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String sexo;
    protected String email;
    protected String dataNas;
    protected String telefone;

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

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(String nome, String cpf, String email, String sexo, String data, String numero){
        setCpf(cpf);
        setDataNas(data);
        setEmail(email);
        setNome(nome);
        setSexo(sexo);
        setTelefone(numero);
    }
    public Pessoa(){}

    public String toString(){
        return "Nome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nSexo: " + getSexo() + "\nTelefone: " + getTelefone();
    }
}
