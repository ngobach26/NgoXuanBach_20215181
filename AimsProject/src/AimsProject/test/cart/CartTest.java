package AimsProject.test.cart;
import AimsProject.disc.DigitalVideoDisc;
import AimsProject.cart.Cart;;

public class CartTest {
    public static void main(String[] args) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tokyo goul", "Animation", 18.99f);

        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd4,dvd2,dvd3);
        
        System.out.println("BEFORE REMOVE");
        anOrder.displayCart();

        anOrder.removeDigitalVideoDisc(dvd4);

        System.out.println("AFTER REMOVE");
        anOrder.displayCart();

        anOrder.searchById(1);

        anOrder.searchByTitle("Aladin");

    }
}
