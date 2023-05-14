package AimsProject.test.store;

import AimsProject.disc.DigitalVideoDisc;
import AimsProject.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store st = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        st.addDVD(dvd1);
        st.addDVD(dvd2);
        st.addDVD(dvd3);
        st.removeDVD(dvd3);

    }
    
}