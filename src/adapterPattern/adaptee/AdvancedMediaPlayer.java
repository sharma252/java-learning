package adapterPattern.adaptee;

public class AdvancedMediaPlayer {
    public void playVideoMp4(String fileName) {
        System.out.println("Playing video mp4: " + fileName);
    }

    public void playStream(String fileName) {
        System.out.println("Playing audio stream: " + fileName);
    }
}
