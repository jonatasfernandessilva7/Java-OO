package getESet;

public class Main {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa();

        String nome;
        nome = pessoa.getNome();
        System.out.println(nome);

        int idadeGet = pessoa.getIdade();
        System.out.println(idadeGet);

        int idade = pessoa.setIdade(13);
        System.out.println(idade);
    }
}
