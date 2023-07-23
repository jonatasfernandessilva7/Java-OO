package Polimorfismo.DevFlix;

public class Filme extends Video{
    public Filme(String nome){
        super(nome);
    }

    @Override
    public void play(){
        super.play();
    }
    public void play(int indicacaoDeIdade){
        System.out.println("play video " + getNome() + " para maiores de " + indicacaoDeIdade);
    }
}
