package proxyPattern;

import proxyPattern.proxyVideoDownloader.ProxyVideoDownloader;
import proxyPattern.videoDownloader.VideoDownloader;

//The Proxy Pattern is a structural design pattern that provides a surrogate or placeholder for another object.
// It acts as an intermediary, controlling access to the original object.
public class ProxyPatternDemo {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();

        videoDownloader.downloadVideo("12321");
        videoDownloader.downloadVideo("12421");
        videoDownloader.downloadVideo("12321");
    }
}
