package aims;

import java.util.Scanner;

import cart.Cart;
import media.*;
import store.*;

public class Aims {
    public static Store store = new Store();
    public static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1.View Store");
        System.out.println("2.Update Store");
        System.out.println("3.See current cart");
        System.out.println("0.Exit");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Please choose number: 0-1-2-3");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                storeMenu.displayStore();
                storeMenu.storeMenu();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                showCart();
                CartMenu.cartMenu();
                break;
            case 0:
                System.exit(0);

            default:
                showMenu();
                break;
        }
    }
    public static void updateStore() {
        System.out.println("\nOptions:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Add a Media");
        System.out.println("2.Remove a Media");
        System.out.println("0.Back");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Please choose number: 0-1-2");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addMedia();
                break;
            case 2:
                removeMedia();
                break;
            case 0:
                showMenu();
                break;
            default:
                updateStore();
                break;
        }

    }

    public static void addMedia() {
        System.out.println("\nOptions:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Add DVD");
        System.out.println("2.Add Book");
        System.out.println("3.Add CD");
        System.out.println("0.Back");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                addDVD();
                break;
            case 2:
                addBook();
                break;
            case 3:
                addCD();
                break;
            case 0:
                updateStore();
                break;
            default:
                addMedia();
                break;
        }
    }
    public static void removeMedia() {
        System.out.println("\nOptions:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Remove By ID");
        System.out.println("2.Remove By Title");
        System.out.println("0.Back");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                removeByID();
                break;
            case 2:
                removeByTitle();
                break;
            case 0:
                updateStore();
                break;
            default:
                removeMedia();
                break;
        }    
    }

    public static void removeByID() {
        storeMenu.displayStore();
        System.out.println("Enter Id of Media you want to remove:");
        int id = scanner.nextInt();
        store.removeMedia(store.findMediaById(id));
        removeMedia();
    }
    public static void removeByTitle() {
        storeMenu.displayStore();
        System.out.println("Enter Title of Media you want to remove:");
        String Title = helper.scanTitle();
        store.removeMedia(store.findMediaByTitle(Title));
        removeMedia();
    }

    public static void addDVD() {
        String title =helper.scanTitle();
        String category = helper.scanCategory();
        String director = helper.scanDirector();
        int length = helper.scanLength(); 
        float cost = helper.scanCost();
        DigitalVideoDisc disc = new DigitalVideoDisc(title, category, director, length, cost);
        store.addMedia(disc);
        addMedia();
    }

    public static void addBook() {
        String title = helper.scanTitle(),category = helper.scanCategory();
        float cost = helper.scanCost();
        Book book = new Book(title, category, cost);
        store.addMedia(book);
        addMedia();
    }
    public static void addCD(){
        String title = helper.scanTitle(),category = helper.scanCategory(),director = helper.scanDirector(),artist = helper.scanArtist();
        int length = helper.scanLength();
        float cost = helper.scanCost();
        CompactDisc cd = new CompactDisc(title, category, director, length, cost, artist);
        store.addMedia(cd);
        addMedia();

    }   
    

    public static void addMediaToCart(Media media) {
        cart.addMedia(media);
    }

    public static void showCart() {
        System.out.println(cart.toString());
    }

    public static void main(String[] args) {
        showMenu();
        scanner.close();

    }
}
