package aims;

import java.util.Scanner;

import media.*;
import cart.*;

public class storeMenu {
    private static Cart cart = Aims.cart;
    private static Scanner scanner = new Scanner(System.in);

    public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.See a Media's details");
        System.out.println("2.Add a Media to Cart");
        System.out.println("3.Play a Media");
        System.out.println("4.See current cart");
        System.out.println("0.Back");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Please choose number: 0-1-2-3-4");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                seeMediaDetail();
                break;
            case 2:
                addMediaToCart();
                storeMenu();
                break;
            case 3:
                playMedia();
                break;
            case 4:
                Aims.showCart();
                storeMenu();
                break;
            case 0:
                Aims.showMenu();
                break;
            default:
                storeMenu();
                break;
        }
    }

    public static void displayStore() {
        System.out.println(Aims.store.toString());
    }

    public static void seeMediaDetail() {
        System.out.println("Enter title of media");
        String title = helper.scanTitle();
        Media media = Aims.store.findMediaByTitle(title);
        System.out.println(media.toString());
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.Add to cart");
        System.out.println("2.Play");
        System.out.println("0.Back");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                cart.addMedia(media);
                seeMediaDetail();
                break;
            case 2:
                Play(media);
                seeMediaDetail();
            case 0:
                storeMenu();
            default:
                seeMediaDetail();
                break;
        }
    }

    public static void playMedia() {
        System.out.println("Enter title of media");
        String title = helper.scanTitle();
        Media media = Aims.store.findMediaByTitle(title);
        Play(media);
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.Add to cart");
        System.out.println("2.Play another");
        System.out.println("0.Back");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                cart.addMedia(media);
                break;
            case 2:
                playMedia();
            case 3:
                storeMenu();
            case 0:
                storeMenu();
            default:
                playMedia();
                break;
        }

    }

    public static void Play(Media media) {
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

    public static void addMediaToCart(){
        System.out.println("Enter title of media");
        String title = helper.scanTitle();
        Media media = Aims.store.findMediaByTitle(title);
        cart.addMedia(media);
    }
}
