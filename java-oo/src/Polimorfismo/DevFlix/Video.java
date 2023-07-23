package Polimorfismo.DevFlix;

public class Video {
    private String nome;

    public Video(String nome){
        this.nome = nome;
    }

    public void play(){
        System.out.println("play video " + getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
