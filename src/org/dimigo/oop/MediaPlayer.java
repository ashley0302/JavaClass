package org.dimigo.oop;

public class MediaPlayer {
    private int volume;
    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer(){

    }
    public static MediaPlayer getInstance(){
        return instance;
    }

    public MediaPlayer(int volume) {
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
