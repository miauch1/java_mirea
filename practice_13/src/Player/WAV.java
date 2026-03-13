package Player;

import javax.sound.sampled.*;
import java.io.File;

public class WAV implements MediaPlayer {
    private Clip clip;

    @Override
    public void play(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Playing WAV file: " + filePath);
        } catch (Exception e) {
            System.err.println("Error playing WAV file: " + e.getMessage());
        }
    }
}
