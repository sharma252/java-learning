package proxyPattern.proxyVideoDownloader;

import proxyPattern.videoDownloader.RealVideoDownloader;
import proxyPattern.videoDownloader.VideoDownloader;

import java.util.HashMap;
import java.util.Map;

// Step 3: Proxy class that controls access to the real downloader
public class ProxyVideoDownloader implements VideoDownloader {
    private RealVideoDownloader realVideoDownloader;
    private Map<String,String> cache;

    public ProxyVideoDownloader() {
        this.realVideoDownloader = new RealVideoDownloader();
        this.cache = new HashMap<String,String>();
    }

    @Override
    public void downloadVideo(String videoId) {
       if(cache.containsKey(videoId)) {
           System.out.println("Fetching video from cache..." + videoId);
       }
       else {
           realVideoDownloader.downloadVideo(videoId);
           cache.put(videoId, "Video Data");
       }
    }
}
