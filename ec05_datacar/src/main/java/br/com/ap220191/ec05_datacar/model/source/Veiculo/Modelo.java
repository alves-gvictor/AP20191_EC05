package Veiculo;

public class Modelo extends Marca {

    protected String nome;
    protected String ano;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Modelo(String nome, String ano){
        setAno(ano);
        setNome(nome);
    }
    public String toString(){
        return "\nModelo: " + getNome() + "\nAno: " + getAno();
    }
}
