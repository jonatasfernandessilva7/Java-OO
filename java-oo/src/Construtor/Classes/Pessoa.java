package Construtor.Classes;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    //método construtor
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public int setIdade(int idade){
        return this.idade = idade;
    }

    public double setAltura(double altura){
        return this.altura = altura;
    }
}
