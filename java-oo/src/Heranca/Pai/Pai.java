package Heranca.Pai;

public class Pai {

    private String nome, cor, raca;
    private int idade;

    public Pai(String nome, String cor, String raca){
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
