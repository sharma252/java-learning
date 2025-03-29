package adapterPattern;

import adapterPattern.adapter.MediaPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        System.out.println("-------------------------------------------------");
        mediaPlayer.play("tum_hi_ho.mp3","mp3");
        System.out.println("-------------------------------------------------");
        mediaPlayer.play("tere_hawaale.mp4","mp4");
        System.out.println("-------------------------------------------------");
        mediaPlayer.play("iShowSpeedLive.stream","stream");
        System.out.println("-------------------------------------------------");
        mediaPlayer.play("web_hec.avi","avi");
        System.out.println("-------------------------------------------------");
    }
}
