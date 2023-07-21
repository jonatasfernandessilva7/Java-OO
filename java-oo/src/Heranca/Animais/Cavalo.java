package Heranca.Animais;

import Heranca.Interface.Animais;
import Heranca.Pai.Pai;

public class Cavalo extends Pai implements Animais {

    public Cavalo(String nome, String cor, String raca){
        super(nome, cor, raca);
    }
    @Override
    public void acordar(){

        System.out.println("inrinrinrin estou acordado hein");
    }

    @Override
    public void comer(){

        System.out.println("inrinrinrin estou comendo grama!");
    }

    @Override
    public void dormir(){

        System.out.println("inrinrinrin que sono vou dormir");
    }

    @Override
    public void fala(){
        System.out.println("inrinrinrin");
    }

    @Override
    public void dizIdade(){
        System.out.println("tenho "+ getIdade() + " anos");
    }
}
