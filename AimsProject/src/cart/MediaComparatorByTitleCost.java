package cart;

import java.util.Comparator;
import media.Media;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        if(m1.getTitle().compareTo(m2.getTitle()) == 0){
            return Float.compare(m1.getCost(), m2.getCost());
        }else{
            return m1.getTitle().compareTo(m2.getTitle());
        }
    }
}
