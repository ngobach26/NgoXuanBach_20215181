package hust.soict.globalict.cart;

import java.util.Comparator;
import hust.soict.globalict.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    public int compare(Media m1, Media m2) {
        if(Float.compare(m1.getCost(), m2.getCost()) == 0){
            return m1.getTitle().compareTo(m2.getTitle());
        }else{
            return Float.compare(m1.getCost(), m2.getCost());
        }
    }
}
