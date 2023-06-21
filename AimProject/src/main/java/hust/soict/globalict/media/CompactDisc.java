package hust.soict.globalict.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }


    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super( title, category, director, length, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category,float cost){
       super( title, category, cost);
    }

    

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("The track already exists in this CD.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("The track does not exist in this CD.");
        }
    }

    public int getLengthAllTrack() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        for (Track track : tracks) {
            track.play();
            System.out.println();
        }
    }

}
