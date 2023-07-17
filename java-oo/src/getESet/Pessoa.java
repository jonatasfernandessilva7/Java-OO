package getESet;

public class Pessoa {

    private String nome =  "jonatas";
    private int idade = 10;

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public int setIdade(int idade){
        return this.idade = idade;
    }
}
