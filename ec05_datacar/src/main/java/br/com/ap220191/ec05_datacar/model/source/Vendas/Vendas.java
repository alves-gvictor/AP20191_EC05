package Vendas;

import Pessoa.Pessoa;
import Veiculo.Veiculo;
import Pessoa.Cliente;
import Pessoa.FuncionarioVendedor;
import java.util.Date;

public class Vendas {
    private String data;
    private int somaVendasMes;
    private FuncionarioVendedor funcionario;
    private Cliente nome;
    private Veiculo veiculo;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getSomaVendasMes() {
        return somaVendasMes;
    }

    public void setSomaVendasMes(int somaVendasMes) {
        this.somaVendasMes = somaVendasMes;
    }

    public String getFuncionario() {
        return funcionario.toString();
    }

    public void setFuncionario(FuncionarioVendedor funcionario) {
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome.toString();
    }

    public void setNome(Cliente nome) {
        this.nome = nome;
    }

    public String getVeiculo() {
        return veiculo.toString();
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void transacao(FuncionarioVendedor funcionario, Cliente nome, Veiculo veiculo, String data){
        setFuncionario(funcionario);
        setNome(nome);
        setVeiculo(veiculo);
        setData(data);
    }
    public int calculaQuantidadeVendas(Date data, int quantidade){
        return 0; // Criar o metodo;
    }

    public String Relatorio(){
        return "Relatório de Vendas \n" + "Informações do Funcionário " + getFuncionario() + "\nInformações do Cliente " + getNome() +  "\nData: " + getData();
    }

}
