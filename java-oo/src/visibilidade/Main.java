package visibilidade;

public class Main {
    public static void main(String[] args){

        FestaVip festa = new FestaVip();
        festa.beberCha();
        //festa.comerBolo(); -> não pode ser acessado pois está privado
        festa.entrar();
        festa.qtdCha = 150;
        //festa.qtdBolo = 15; -> não pode ser acessado pois está privado

        System.out.println(festa.qtdCha);

    }
}
