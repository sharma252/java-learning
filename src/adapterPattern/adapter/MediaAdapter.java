package adapterPattern.adapter;

import adapterPattern.adaptee.AdvancedMediaPlayer;
import adapterPattern.targetInterface.IMediaPlayer;

public class MediaAdapter implements IMediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String fileType) {
        if(fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("stream")) {
            this.advancedMediaPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String filename,String fileType){
        if(fileType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playVideoMp4(filename);
        }
        if(fileType.equalsIgnoreCase("stream")) {
            advancedMediaPlayer.playStream(filename);
        }
    }

}
