package aims;

import java.util.Scanner;

import cart.Cart;
import media.*;
import store.*;
import helper.*;

public class Aims {
    public static Store store = new Store();
    public static Cart anCart = new Cart();
    public static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("1.View Store");
        System.out.println("2.Update Store");
        System.out.println("3.See current cart");
        System.out.println("0.Exit");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Please choose number: 0-1-2-3");

        int option = Helper.scanOption();
        switch (option) {
            case 1:
                store.displayStore();
                storeMenu();
                break;
            case 2:
                updateStoreMenu();
                break;
            case 3:
                anCart.displayCart();
                cartMenu();
                break;
            case 0:
                System.exit(0);
            default:
                showMenu();
        }
    }

    public static void updateStoreMenu() {
        System.out.println("\nUPDATE STORE MENU:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Add a Media");
        System.out.println("2.Remove a Media");
        System.out.println("0.Back");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Please choose number: 0-1-2");

        int option = Helper.scanOption();
        switch (option) {
            case 1:
                addMediaMenu();
                break;
            case 2:
                removeMediaMenu();
                break;
            case 0:
                showMenu();
                break;
            default:
                updateStoreMenu();
        }

    }

    public static void addMediaMenu() {
        System.out.println("\nADD MEDIA MENU");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Add DVD");
        System.out.println("2.Add Book");
        System.out.println("3.Add CD");
        System.out.println("0.Back");
        System.out.println("---------------------------------------------------------------------");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                store.addDVD();
                addMediaMenu();
                break;
            case 2:
                store.addBook();
                addMediaMenu();
                break;
            case 3:
                store.addCD();
                addMediaMenu();
                break;
            case 0:
                updateStoreMenu();
                break;
            default:
                addMediaMenu();
        }
    }

    public static void removeMediaMenu() {
        System.out.println("\nOptions:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Remove By ID");
        System.out.println("2.Remove By Title");
        System.out.println("0.Back");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                store.removeByID();
                removeMediaMenu();
                break;
            case 2:
                store.removeByTitle();
                removeMediaMenu();
                break;
            case 0:
                updateStoreMenu();
                break;
            default:
                removeMediaMenu();
        }
    }

    public static void storeMenu() {
        System.out.println("\nSTORE MENU: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.See a Media's details");
        System.out.println("2.Add a Media to Cart");
        System.out.println("3.Play a Media");
        System.out.println("4.See current cart");
        System.out.println("0.Back");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Please choose number: 0-1-2-3-4");

        int option = Helper.scanOption();
        switch (option) {
            case 1:
                seeMediaDetailMenu();
                break;
            case 2:
                anCart.addMediaToCart();
                storeMenu();
                break;
            case 3:
                playMediaMenu();
                break;
            case 4:
                anCart.displayCart();
                cartMenu();
                break;
            case 0:
                showMenu();
                break;
            default:
                storeMenu();
        }
    }

    public static void playMediaMenu() {
        System.out.println("\nPLAY MEDIA MENU");
        Media media = Helper.scanTitleFindMedia();
        Helper.play(media);
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.Add to cart");
        System.out.println("2.Play another");
        System.out.println("0.Back");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                anCart.addMedia(media);
                storeMenu();
                break;
            case 2:
                playMediaMenu();
                break;
            case 0:
                storeMenu();
            default:
                playMediaMenu();
        }

    }

    public static void seeMediaDetailMenu() {
        System.out.println("\nSEE MEDIA DETAIL MENU");
        Media media = Helper.scanTitleFindMedia();
        System.out.println(media.toString());
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.Add to cart");
        System.out.println("2.Play");
        System.out.println("0.Back");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                anCart.addMedia(media);
                storeMenu();
                break;
            case 2:
                Helper.play(media);
                showMenu();
            case 0:
                storeMenu();
            default:
                seeMediaDetailMenu();
        }
    }

    public static void cartMenu() {
        System.out.println("Options:");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                filterMediaInCartMenu();
                break;
            case 2:
                sortMediasInCartMenu();
                break;
            case 3:
                removeMediaFromCartMenu();
                break;
            case 4:
                playMediaMenuCart();
                break;
            case 5:
                anCart.placeOrder();
                cartMenu();
                break;
            case 0:
                showMenu();
                break;
            default:
                cartMenu();
                break;
        }
    }

    public static void playMediaMenuCart() {
        System.out.println("\nPLAY MEDIA MENU CART");
        Media media = Helper.scanTitleFindMedia();
        Helper.play(media);
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.Add to cart");
        System.out.println("2.Play another");
        System.out.println("0.Back");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                anCart.addMedia(media);
                playMediaMenu();
                break;
            case 2:
                playMediaMenu();
                break;
            case 0:
                cartMenu();
            default:
                playMediaMenu();
        }

    }

    public static void removeMediaFromCartMenu() {
        System.out.println("\n REMOVE MEDIA FROM CART MENU:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Remove By ID");
        System.out.println("2.Remove By Title");
        System.out.println("0.Back");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                anCart.removeCartByID();
                removeMediaFromCartMenu();
                break;
            case 2:
                anCart.removeCartByTitle();
                removeMediaFromCartMenu();
                break;
            case 0:
                cartMenu();
                break;
            default:
                removeMediaFromCartMenu();
                break;
        }
    }

    public static void filterMediaInCartMenu() {
        System.out.println("\nFILTER MEDIA IN CART MENU");
        System.out.println("---------------------------------------");
        System.out.println("1. Filter by title");
        System.out.println("2. Filter by ID");
        System.out.println("0. Back");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                anCart.displayFilterMediaByTitle();
                filterMediaInCartMenu();
                break;
            case 2:
                anCart.displayFilterMediaById();
                filterMediaInCartMenu();
                break;
            case 0:
                cartMenu();
                break;
            default:
                filterMediaInCartMenu();

        }
    }

    public static void sortMediasInCartMenu() {
        System.out.println("\nSORT MEDIA IN CART MENU:");
        System.out.println("-----------------------");
        System.out.println("1.Sort by Title");
        System.out.println("2.Sort by Cost");
        System.out.println("0.back");
        System.out.println("Please enter option: 0-1-2");
        int option = Helper.scanOption();
        switch (option) {
            case 1:
                anCart.sortCartByCostTitle();
                sortMediasInCartMenu();
                break;
            case 2:
                anCart.sortCartByTitleCost();
                sortMediasInCartMenu();
                break;
            case 0:
                cartMenu();
                break;
            default:
                sortMediasInCartMenu();
                break;
        }
    }

    public static void main(String[] args) {
        showMenu();
        scanner.close();
    }
}
