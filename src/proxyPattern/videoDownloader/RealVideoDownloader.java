package proxyPattern.videoDownloader;

// Step 2: Real object that connects to YouTube and downloads the video
public class RealVideoDownloader implements VideoDownloader {
    @Override
    public void downloadVideo(String videoId) {
        System.out.println("Connecting to youtube...");
        System.out.println("Downloading video..." + videoId);
    }
}
