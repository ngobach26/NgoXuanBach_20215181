package media;

public class Disc extends Media {
    protected int length;
    protected String director;

    public Disc(){}

    public Disc(int id, String title, String category,String director, int length, float cost) {
        this.id = id;
        super.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
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
