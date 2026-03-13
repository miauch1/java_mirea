package Player;

public class Adapter implements MediaPlayer {
    private MP3 mp3;
    private WAV wav;

    @Override
    public void play(String filePath) {
        if (filePath.endsWith(".mp3")) {
            if (mp3 == null) {
                mp3 = new MP3();
            }
            mp3.play(filePath);
        } else if (filePath.endsWith(".wav")) {
            if (wav == null) {
                wav = new WAV();
            }
            wav.play(filePath);
        } else {
            System.out.println("Unsupported file format: " + filePath);
        }
    }

}
