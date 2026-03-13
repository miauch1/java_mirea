package Player;

import javazoom.jl.player.Player;
import java.io.FileInputStream;

public class MP3 implements MediaPlayer {
    private Player player;

    @Override
    public void play(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            player = new Player(fis);
            System.out.println("Playing MP3: " + filePath);
            player.play();
        } catch (Exception e) {
            System.err.println("Error playing MP3 file: " + e.getMessage());
        }
    }
}
