package adapterPattern.adapter;

import adapterPattern.targetInterface.IMediaPlayer;

public class MediaPlayer implements IMediaPlayer {
    public MediaAdapter adapter;

    @Override
    public void play(String fileName, String fileType){
        if(fileType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(fileType.equalsIgnoreCase("mp4") || fileType.equalsIgnoreCase("stream")){
            this.adapter = new MediaAdapter(fileType);
            adapter.play(fileName,fileType);
        }
        else {
            System.out.println("Invalid file type");
        }
    }
}
