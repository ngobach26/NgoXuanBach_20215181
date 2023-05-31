package aims;

import java.util.Scanner;
import media.*;

public class helper {
    public static Scanner scanner = new Scanner(System.in);

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
        } while (length <= 0);
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
        } while (cost <= 0);
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

    public static void Play(Media media){
        if (media instanceof Book) {
            System.out.println("Media is book cannot play");
        }
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc disc = (DigitalVideoDisc) media;
            if (disc.getLength() < 0) {
                System.out.println("Cannot play Media");
            } else {
                System.out.println("Play");
                System.out.println("-------------------------------------------------");
                System.out.println(disc.getTitle() + " Length: " + disc.getLength());
            }
        }
        if (media instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) media;
            if (cd.getLength() < 0) {
                System.out.println("Cannot play Media");
            } else {
                System.out.println(cd.getTitle() + " Length: " + cd.getLength());
            }
        }
    }
}
