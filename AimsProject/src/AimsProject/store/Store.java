package AimsProject.store;

import AimsProject.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];
    private int numOfItems = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        this.itemsInStore[numOfItems] = dvd;
        System.out.println("The DVD " + dvd.getTitle() + " have been added!");
        numOfItems++;
    }

    public void removeDVD(DigitalVideoDisc dvd){
        if (numOfItems == 0) {
			System.out.println("The store is emplty!");
		} else {
			int check = -1;
			for (int i = 0; i < numOfItems; i++) {
				if (itemsInStore[i].equals(dvd)) {
					check = i;
					break;
				}
			}
			if (check == -1) {
				System.out.println("Item not found!");
			} else {
				for (int i = check; i < numOfItems - 1; i++) {
					itemsInStore[i] = itemsInStore[i + 1];

				}
				System.out.println("The DVD " + dvd.getTitle() + " have been deleted!");
				numOfItems--;
			}
		}        
    }
}
