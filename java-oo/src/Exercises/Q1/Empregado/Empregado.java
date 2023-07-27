package Exercises.Q1.Empregado;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
        if (salarioMensal < 0 ){
            this.salarioMensal = 0.0;
        }
    }

    public void aumentarSalario(double aumento){
        aumento *= this.salarioMensal;
        this.salarioMensal = getSalarioMensal() + aumento;
    }
}
