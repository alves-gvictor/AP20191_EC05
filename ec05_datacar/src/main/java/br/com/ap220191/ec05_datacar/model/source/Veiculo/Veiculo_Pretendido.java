package Veiculo;

import Pessoa.Cliente_Comprador;

public class Veiculo_Pretendido extends Veiculo {

    private Cliente_Comprador nome;

    public Cliente_Comprador getNome() {
        return nome;
    }

    public void setNome(Cliente_Comprador nome) {
        this.nome = nome;
    }

    public Veiculo_Pretendido(String cor, String placa, Modelo modelo, Marca marca, double valor, Cliente_Comprador nome){
        super.cor = cor;
        super.placa = placa;
        super.modelo = modelo;
        super.marca = marca;
        super.valor = valor;
        setNome(nome);
    }
}
