package AimsProject.cart;

import AimsProject.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void displayCart() {
		StringBuffer sb = new StringBuffer("\n***********************CART***********************\nOrdered Items:");
		for (int i = 0; i < this.qtyOrdered; i++) {
			sb.append("\n" + (i+1) + ". DVD - " + itemsOrdered[i].getTitle() + " - "
					+ itemsOrdered[i].getCategory() + " - "
					+ itemsOrdered[i].getDirector() + " - "
					+ (itemsOrdered[i].getLength() == 0 ? "Unknown" : itemsOrdered[i].getLength()) + " : "
					+ (itemsOrdered[i].getCost() == 0 ? "Unknown" : itemsOrdered[i].getCost()) + "$");
		}
		sb.append("\nTotal cost: " + this.totalCost());
		sb.append("\n***************************************************");
		System.out.println(sb);
		
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The Cart is full!!");
		} else {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The DVD " + disc.getTitle() + " have been added!");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc... dvdlist) {
		if (qtyOrdered + dvdlist.length >= MAX_NUMBERS_ORDERED) {
			System.out.println("The Cart is full!!");
		} else {
			for (DigitalVideoDisc dvd : dvdlist) {
				itemsOrdered[qtyOrdered] = dvd;
				qtyOrdered++;
				System.out.println("The DVD " + dvd.getTitle() + " have been added!");
			}
		}
	}

	// public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist) {
	// if (qtyOrdered + dvdlist.length >= MAX_NUMBERS_ORDERED) {
	// System.out.println("The Cart is full!!");
	// } else {
	// for (DigitalVideoDisc dvd : dvdlist) {
	// itemsOrdered[qtyOrdered] = new DigitalVideoDisc(dvd.getTitle(),
	// dvd.getCategory(), dvd.getDirector(),
	// dvd.getLength(), dvd.getCost());
	// qtyOrdered++;
	// System.out.println("The DVD" + dvd.getTitle() + "have been added!");
	// }
	// }
	// }

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 >= MAX_NUMBERS_ORDERED) {
			System.out.println("The Cart is full!!");
		} else {
			itemsOrdered[qtyOrdered] = dvd1;
			itemsOrdered[qtyOrdered + 1] = dvd2;
			qtyOrdered = qtyOrdered + 2;
			System.out.println("The DVD " + dvd1.getTitle() + " have been added!");
			System.out.println("The DVD " + dvd2.getTitle() + " have been added!");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is emplty!");
		} else {
			int check = -1;
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].equals(disc)) {
					check = i;
					break;
				}
			}
			if (check == -1) {
				System.out.println("Item not found!");
			} else {
				for (int i = check; i < qtyOrdered - 1; i++) {
					itemsOrdered[i] = itemsOrdered[i + 1];

				}
				System.out.println("The DVD " + disc.getTitle() + " have been deleted!");
				qtyOrdered--;
			}
		}

	}

	public float totalCost() {
		float sum = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}

	// public void displayCart() {
	// for (int i = 0; i < qtyOrdered; i++) {
	// System.out.println(itemsOrdered[i].getTitle());
	// }
	// }

}