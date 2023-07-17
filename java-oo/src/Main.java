public class Main {
    public static void main(String[] args) {

        /*aprendendo conceitos de poo*/

        Celular celular = new Celular();

        celular.marca = "samsung";
        celular.armazenamento = 128;
        celular.sistemaOperacional = "IOS";
        celular.tamanhoDaTela = 7.5;

        System.out.println(" o celular eh da marca " + celular.marca + " armazenamento de " + celular.armazenamento
         + " com o SO " + celular.sistemaOperacional + " e a tela tem " + celular.tamanhoDaTela + " polegadas");
    }
}