package test.cart;
import cart.Cart;
import media.DigitalVideoDisc;;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tokyo goul", "Animation", 18.99f);

        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(dvd3);
        anOrder.addMedia(dvd4);
        
        System.out.println("BEFORE REMOVE");
        anOrder.displayCart();

        anOrder.removeMedia(dvd4);

        System.out.println("AFTER REMOVE");
        anOrder.displayCart();

    }
}
