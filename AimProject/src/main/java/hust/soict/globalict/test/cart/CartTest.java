package hust.soict.globalict.test.cart;

import hust.soict.globalict.cart.Cart;
import hust.soict.globalict.media.Book;
import hust.soict.globalict.media.CompactDisc;
import hust.soict.globalict.media.DigitalVideoDisc;


public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd = new DigitalVideoDisc( "b", "Fiction", "Bach", 0, 0);
        Book book = new Book("c", "Fiction", 0);
        CompactDisc cd = new CompactDisc("a", "pop", "Bach", 0, 0, "Back");
        cart.addMedia(cd);
        cart.addMedia(book);
        cart.addMedia(dvd);
        System.out.println(cart.toString()); 
        cart.sortCartByTitleCost();
        System.out.println(cart.toString()); 
    }
}
