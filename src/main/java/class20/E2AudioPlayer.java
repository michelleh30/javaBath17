package class20;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E2AudioPlayer {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fis=new FileInputStream("C:\\Users\\michelle\\IdeaProjects\\newJavaProject1\\src\\main\\java\\class20\\Ambient-music-free.mp3");
        Player mp3=new Player(fis);
        mp3.play();
    }

}
