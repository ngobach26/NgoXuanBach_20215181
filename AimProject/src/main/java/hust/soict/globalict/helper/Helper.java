package hust.soict.globalict.helper;

import java.util.Scanner;

import hust.soict.globalict.aims.Aims;
import hust.soict.globalict.media.Book;
import hust.soict.globalict.media.CompactDisc;
import hust.soict.globalict.media.DigitalVideoDisc;
import hust.soict.globalict.media.Media;
import hust.soict.globalict.store.Store;
import hust.soict.globalict.cart.Cart;

public class Helper {
    public static Scanner scanner = Aims.scanner;
    private static Store store = Aims.store;
    private static Cart anCart = Aims.anCart;

    public static String scanTitle() {
        String title;
        do {
            System.out.println("Title:");
            title = scanner.nextLine().trim(); // trim() removes leading/trailing whitespace
        } while (title.isEmpty()); // continue looping if title is empty
        return title;
    }

    public static String scanCategory() {
        String category;
        do {
            System.out.println("Category:");
            category = scanner.nextLine().trim();
        } while (category.isEmpty());
        return category;
    }

    public static String scanDirector() {
        String director;
        do {
            System.out.println("Director:");
            director = scanner.nextLine().trim();
        } while (director.isEmpty());
        return director;
    }

    public static int scanLength() {
        int length;
        do {
            System.out.println("Length:");
            while (!scanner.hasNextInt()) { // continue looping if input is not an integer
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // consume invalid input
            }
            length = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline character
        } while (length < 0);
        return length;
    }

    public static float scanCost() {
        float cost;
        do {
            System.out.println("Cost:");
            while (!scanner.hasNextFloat()) { // continue looping if input is not a float
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // consume invalid input
            }
            cost = scanner.nextFloat();
            scanner.nextLine(); // consume leftover newline character
        } while (cost < 0);
        return cost;
    }

    public static String scanArtist() {
        String artist;
        do {
            System.out.println("Artist:");
            artist = scanner.nextLine().trim();
        } while (artist.isEmpty());
        return artist;
    }

    public static int scanOption() {
        int option;
        do {
            System.out.println("Option:");
            while (!scanner.hasNextInt()) { // continue looping if input is not an integer
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // consume invalid input
            }
            option = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline character
        } while (option < 0);
        return option;
    }

    public static int scanID() {
        int id;
        do {
            System.out.println("ID:");
            while (!scanner.hasNextInt()) { // continue looping if input is not an integer
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine(); // consume invalid input
            }
            id = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline character
        } while (id < 0);
        return id;
    }

    public static void play(Media media){
        if (media instanceof Book) {
            System.out.println("Media is Book cannot play");
        }
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc disc = (DigitalVideoDisc) media;
            if (disc.getLength() < 0) {
                System.out.println("Cannot play this DVD");
            } else {
                disc.play();
            }
        }
        if (media instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) media;
            if (cd.getLength() < 0) {
                System.out.println("Cannot play this CD");
            } else {
                cd.play();
            }
        }
    }

    public static Media scanTitleFindMedia(){
        String title ;
        Media media;
        do{
            title= scanTitle();
            media =store.findMediaByTitle(title);

        }while(media == null);

        return media;
    }
}
