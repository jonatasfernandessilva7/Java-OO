package Heranca.Animais;

import Heranca.Interface.Animais;
import Heranca.Pai.Pai;

public class Cachorro extends Pai implements Animais{

    public Cachorro(String nome, String cor, String raca){
        super(nome, cor, raca);
    }

    @Override
    public void acordar(){
        System.out.println("auau estou acordado!");
    }
    @Override
    public void comer(){
        System.out.println("auau estou comendo!");
    }
    @Override
    public void dormir(){
        System.out.println("auau vou dormir, ate amanha");
    }

    @Override
    public void fala(){
        System.out.println("auau");
    }

    @Override
    public void dizIdade(){
        System.out.println("tenho "+ getIdade() + " anos");
    }
}
