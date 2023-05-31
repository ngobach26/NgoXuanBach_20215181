package media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track other = (Track) obj;
        return title.equals(other.title) && length == other.length;
    }

    public void play() {
        if (this.getLength() <= 0) {
            System.out.println("Media cannot play");
        } else {
            System.out.println("PLAYING:");
            System.out.println("Playing Track: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());
        }
    }

}
