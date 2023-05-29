package media;

import java.util.*;

public class testBook {
    public static void main(String[] args) {
        // List<Track> tracks = new ArrayList<Track>();
        // Track track1 = new Track("yeu", 1);
        // Track track2 = new Track("yeu 5", 1);
        // Track track3 = new Track("yeu 5", 1);
        // tracks.add(track1);
        // tracks.add(track2);
        // System.out.println(tracks.contains(track3));
        // System.out.println(tracks);
        // tracks.remove(0);
        // System.out.println(tracks);
        Disc disc =new Disc(0, "abc", "abc", "abc", 0, 0);
        Disc disc1 =new Disc(0, "abc", "abc", "abc", 0, 0);
        System.out.println(disc.equals(disc1));
    }
}
