package store;

import java.util.ArrayList;
import media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsInStore.size() == 20) {
            System.out.println("The Store is full!!");
        } else {
            itemsInStore.add(media);
            System.out.println("The " + media.getClass().getName()+" " + media.getTitle() + " have been added!");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " have been removed!");
        } else {
            System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " is not in the store!");
        }
    }
}
