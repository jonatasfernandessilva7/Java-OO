package ManipulandoArquivos.ArquivoTxt;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LendoArquivo {

    private String arquivo;

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public void lerArquivo(String arquivo) throws IOException {
        List<String> textoDoArquivo = Files.readAllLines(Path.of(arquivo));

        for (String texto:textoDoArquivo){
            System.out.println(texto);
        }
    }

    public static void verificarDiretorioEArquivo(){
        Path dir = Paths.get("C:/Users/jonat/OneDrive/Área de Trabalho/jonatas trabalho");
        Path file = Paths.get("C:/Users/jonat/OneDrive/Área de Trabalho/jonatas trabalho/aso jonatas.pdf");

        if(Files.isDirectory(dir)){
            System.out.println("eh um diretorio");
            if (Files.exists(file)){
                System.out.println("existe um arquivo no diretorio");
            }else{
                System.out.println("nao existe arquivo no diretorio");
            }
        }else{
            System.out.println("nao eh um diretorio");
        }
    }
}
