package test.store;

import media.DigitalVideoDisc;
import store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store st = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        st.addMedia(dvd2);
        st.addMedia(dvd1);
        st.removeMedia(dvd2);
    }
    
}
