package Veiculo;

public class Marca {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca(){}
    public Marca(String nome){
        setNome(nome);
    }

    public String toString(){
        return "\nMarca: " + getNome();
    }
}
