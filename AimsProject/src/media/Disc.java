package media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc(String title, String category,String director, int length, float cost) {
        super( title, category, cost);
        this.director = director;
        this.length = length;    
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
