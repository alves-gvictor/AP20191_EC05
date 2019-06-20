package Pessoa;

public class Cliente extends Pessoa {

    public Cliente(String nome, String cpf, String email, String sexo, String data, String numero){
        setCpf(cpf);
        setDataNas(data);
        setEmail(email);
        setNome(nome);
        setSexo(sexo);
        setTelefone(numero);
    }
    public Cliente(){}

    public String toString(){
        return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nSexo: " + getSexo() + "\nTelefone: " + getTelefone();
    }
}
