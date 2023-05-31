package store;

import java.util.ArrayList;
import media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (itemsInStore.isEmpty()) {
            sb.append("The store is empty!");
        } else {
            for (int i = 0; i < itemsInStore.size(); i++) {
                Media media = itemsInStore.get(i);
                sb.append((i + 1) + ". ID" + media.getId() + "-" + media.getClass().getSimpleName() + ": "
                        + media.getTitle() + "-"
                        + media.getCategory() + "-" + media.getCost() + "$\n");
            }
        }
        return sb.toString();
    }

    public void addMedia(Media media) {
        if (itemsInStore.size() == 20) {
            System.out.println("The Store is full!!");
        } else {
            itemsInStore.add(media);
            System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " have been added!");
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

    public Media findMediaByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }
    public Media findMediaById(int id){
        for(Media media : itemsInStore){
            if(media.getId() == id){
                return media;
            }
        }return null;
    }

}
