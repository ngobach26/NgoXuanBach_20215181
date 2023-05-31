package media;

public class DigitalVideoDisc extends Disc implements Playable {
	public static int nbDigitalVideoDiscs = 0;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		DigitalVideoDisc dvd = (DigitalVideoDisc) obj;

		if (Float.compare(dvd.cost, cost) != 0)
			return false;
		if (!title.equals(dvd.title))
			return false;
		if (category != null ? !category.equals(dvd.category) : dvd.category != null)
			return false;
		if (director != null ? !director.equals(dvd.director) : dvd.director != null)
			return false;
		return length == dvd.length;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}




	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getDirector() {
		return director;
	}

	public int getLength() {
		return length;
	}

	public float getCost() {
		return cost;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
}
