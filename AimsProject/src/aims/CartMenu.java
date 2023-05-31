package aims;

import java.util.Scanner;

import cart.Cart;
import media.*;

public class CartMenu {
    private static Cart cart = Aims.cart;
    private static Scanner scanner = new Scanner(System.in);

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
                filterMediaInCart();
                break;
            case 2:
                sortMediasInCart();
                break;
            case 3:
                removeMediaFromCart();
                break;
            case 4:
                playMedia();
                break;
            case 5:
                placeOrder();
                break;
            case 0:
                Aims.showMenu();
                break;
            default:
                cartMenu();
                break;
        }
    }

    public static void sortMediasInCart() {
        System.out.println("\nOptions:");
        System.out.println("-----------------------");
        System.out.println("1.Sort by Title");
        System.out.println("2.Sort by Cost");
        System.out.println("0.back");
        System.out.println("Please enter option: 0-1-2");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                cart.sortCartByTitleCost();
                sortMediasInCart();
                break;
            case 2:
                cart.sortCartByCostTitle();
                sortMediasInCart();
                break;
            case 0:
                cartMenu();
            default:
                sortMediasInCart();
                break;
        }
    }

    public static void removeMediaFromCart() {
        System.out.println("\nOptions:");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("1.Remove By ID");
        System.out.println("2.Remove By Title");
        System.out.println("0.Back");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                removeCartByID();
                removeMediaFromCart();
                break;
            case 2:
                removeCartByTitle();
                removeMediaFromCart();
                break;
            case 0:
                cartMenu();
                break;
            default:
                removeMediaFromCart();
                break;
        }
    }

    public static void displayCart() {
        System.out.println(Aims.cart.toString());
    }

    public static void removeCartByID() {
        displayCart();
        System.out.println("Enter Id of Media you want to remove:");
        int id = scanner.nextInt();
        cart.removeMedia(cart.findMediaById(id));
    }

    public static void removeCartByTitle() {
        displayCart();
        System.out.println("Enter Title of Media you want to remove:");
        String title = helper.scanTitle();
        cart.removeMedia(cart.findMediaByTitle(title));
    }

    public static void playMedia() {
        System.out.println("Enter title of media");
        String title = helper.scanTitle();
        Media media = cart.findMediaByTitle(title);
        helper.Play(media);
        System.out.println("\nOptions: ");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1.Add to cart");
        System.out.println("2.Play another");
        System.out.println("0.Back");
    }

    public static void filterMediaInCart() {

    }

    public static void placeOrder() {

    }
}
