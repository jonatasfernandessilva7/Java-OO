package Polimorfismo.Main;

import Polimorfismo.DevFlix.Filme;
import Polimorfismo.DevFlix.Video;

public class Main {

    public static void main(String[] args){

        Video video = new Video("pedro primeiro");
        Filme filme = new Filme("paulo segundo");
        video.play();
        filme.play();
        filme.play(18);
    }
}
