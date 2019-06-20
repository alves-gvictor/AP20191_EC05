package Pessoa;

import Veiculo.Veiculo;

public class Cliente_Comprador extends Cliente{

    private Veiculo veiculo;

    public String getVeiculo() {
        return veiculo.toString();
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente_Comprador(String cpf, String data, String email, String nome, String sexo, String numero, Veiculo veiculo){
        setCpf(cpf);
        setDataNas(data);
        setEmail(email);
        setNome(nome);
        setTelefone(numero);
        setVeiculo(veiculo);
        setSexo(sexo);
    }

    public String toString(){
        return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nSexo: " + getSexo() + "\nTelefone: " + getTelefone() + "\nVeiculo desejado: " + getVeiculo();
    }
}
