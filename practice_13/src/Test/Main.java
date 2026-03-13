package Test;

import Player.Adapter;

public class Main {
    public static void main(String[] args) {
        Adapter player = new Adapter();

        player.play("/home/roma/java_projects/practice_13/src/Test/test1.wav");
        player.play("/home/roma/java_projects/practice_13/src/Test/test3.mp3");
        player.play("/home/roma/java_projects/practice_13/src/Test/test2.mp3");
    }
}
