package visibilidade;

public class FestaVip {

    //atributos e métodos normais

//    int qtdCha = 10;
//    int qtdBolo = 5;

//    void beberCha(){
//        qtdCha --;
//        System.out.println("bebeu "+qtdCha+" copo de chá");
//    }
//
//    void comerBolo(){
//        qtdBolo --;
//        System.out.println("comeu 4 pedaços de bolo");
//    }

    //atributos e métodos com visibilidade
    public int qtdCha = 10;
    private int qtdBolo = 5;

    public void entrar(){
        beberCha();
        comerBolo();
    }
    public void beberCha(){
        qtdCha --;
        System.out.println("bebeu "+qtdCha+" copo de chá");
    }

    private void comerBolo(){
        qtdBolo --;
        System.out.println("comeu 4 pedaços de bolo");
    }
}
