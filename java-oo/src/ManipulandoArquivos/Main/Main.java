package ManipulandoArquivos.Main;

import ManipulandoArquivos.ArquivoTxt.LendoArquivo;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Path arquivoASerLido = Paths.get("C:/Users/jonat/OneDrive/Área de Trabalho/pessoal/projects/Java-OO/java-oo/conceitos.txt");

        LendoArquivo arquivo = new LendoArquivo();

        arquivo.setArquivo(String.valueOf(arquivoASerLido));

        System.out.println(arquivo.getArquivo());

        arquivo.lerArquivo(String.valueOf(arquivoASerLido));

        LendoArquivo.verificarDiretorioEArquivo();

    }
}
