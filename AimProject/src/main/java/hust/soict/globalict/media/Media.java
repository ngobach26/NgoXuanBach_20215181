package hust.soict.globalict.media;

import java.util.Comparator;
import java.util.Objects;

import hust.soict.globalict.cart.MediaComparatorByCostTitle;
import hust.soict.globalict.cart.MediaComparatorByTitleCost;

public class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
    public static int nbOfMedia = 0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Media)) {
            return false;
        }

        Media m = (Media) o;

        return id == m.id && Objects.equals(title, m.title) &&
                Objects.equals(category, m.category) && cost == m.cost;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
    

    public Media( String title, String category, float cost) {
        this.id = nbOfMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbOfMedia++;
    }


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

}
