package Vendas;

import Pessoa.Cliente_Comprador;
import Pessoa.Cliente;
import Veiculo.Veiculo;
import Veiculo.Marca;
import Veiculo.Modelo;
import Pessoa.FuncionarioVendedor;


public class Transacoes{
    public static void main(String args[]){
        //Crianco uma Marca
        Marca Volkswagen = new Marca("Volkswagen");

        //Criando um Modelo
        Modelo Gol = new Modelo("Gol","2008");

        //Criando o Veiculo
        Veiculo v1 = new Veiculo("amarelo", "NLA-1193", Gol, Volkswagen, 12500.00);

        //Criando o Cliente
        Cliente Matheus = new Cliente_Comprador("04356642177", "08/02/1999", "matheushenrick@me.com", "Matheus Henrick", "Masculino","99299-9449", v1);

        //Criando o Funcionário
        FuncionarioVendedor Jorge = new FuncionarioVendedor("Jorge", "02098767598", "jorgevendas@gmail.com", "Masculino", "20/11/1987","(62) 9 9876-5768",22);

        //Fazendo a Venda
        Vendas venda1 = new Vendas();
        venda1.transacao(Jorge, Matheus, v1, "10/02/2019");

        //Informando relatório de venda
        System.out.println(venda1.Relatorio());
    }
}
