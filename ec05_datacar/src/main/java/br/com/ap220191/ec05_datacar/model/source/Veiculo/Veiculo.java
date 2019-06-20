package Veiculo;

public class Veiculo {
    protected String cor;
    protected String placa;
    protected Modelo modelo;
    protected Marca marca;
    protected double valor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo.toString();
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca.toString();
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Veiculo(String cor, String placa, Modelo modelo, Marca nome, double valor){
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = nome;
        this.valor = valor;
    }
    public Veiculo(){}
    public String toString() {
        return getMarca()  + getModelo() + "\nPlaca: " + getPlaca() + "\nCor: " + getCor() + "\nValor: " + getValor();
    }
}
