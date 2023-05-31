package store;

import java.util.ArrayList;
import media.*;
import helper.*;

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
                sb.append((i + 1) + ". ID:" + media.getId() + "-" + media.getClass().getSimpleName() + ": "
                        + media.getTitle() + "-"
                        + media.getCategory() + "-" + media.getCost() + "$\n");
            }
        }
        return sb.toString();
    }

    public void displayStore(){
        System.out.println("*************************STORE***************************\nList of items:");
        System.out.println(this.toString());
        System.out.println("********************************************************");
    }

    public void addMedia(Media media) {
        if (itemsInStore.size() == 20) {
            System.out.println("The Store is full!!");
        } else {
            itemsInStore.add(media);
            System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " have been added!");
        }
    }

    public void addDVD(){
        System.out.println("\n--------------------");
        System.out.println("ADD DVD");
        System.out.println("--------------------");
        String title =Helper.scanTitle();
        String category = Helper.scanCategory();
        String director = Helper.scanDirector();
        int length = Helper.scanLength(); 
        float cost = Helper.scanCost();
        DigitalVideoDisc disc = new DigitalVideoDisc(title, category, director, length, cost);
        addMedia(disc);
        System.out.println("--------------------");

    }

    public void addBook(){
        System.out.println("\n--------------------");
        System.out.println("ADD BOOK");
        System.out.println("--------------------");
        String title = Helper.scanTitle(),category = Helper.scanCategory();
        float cost = Helper.scanCost();
        Book book = new Book(title, category, cost);
        addMedia(book);
        System.out.println("--------------------");
    }
    
    public void addCD(){
        System.out.println("\n--------------------");
        System.out.println("ADD CD");
        System.out.println("--------------------");
        String title = Helper.scanTitle(),category = Helper.scanCategory(),director = Helper.scanDirector(),artist = Helper.scanArtist();
        int length = Helper.scanLength();
        float cost = Helper.scanCost();
        CompactDisc cd = new CompactDisc(title, category, director, length, cost, artist);
        addMedia(cd);
        System.out.println("--------------------");

    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " have been removed!");
        } else {
            System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " is not in the store!");
        }
    }

    public void removeByID(){
        displayStore();
        int id = Helper.scanID();
        removeMedia(findMediaById(id));
    }

    public void removeByTitle() {
        displayStore();
        String Title = Helper.scanTitle();
        removeMedia(findMediaByTitle(Title));
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
