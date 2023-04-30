package src;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The Cart is full!!");
		} else {
			itemsOrdered[qtyOrdered] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(),
					disc.getLength(), disc.getCost());
			qtyOrdered++;
			System.out.println("The DVD have been added!");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("The cart is emplty!");
		} else {
			int check = -1;
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
					check = i;
					break;
				}
			}
			if (check == -1) {
				System.out.println("Item not found!");
			} else {
				for (int i = check; i < qtyOrdered - 1; i++) {
					itemsOrdered[i] = new DigitalVideoDisc(itemsOrdered[i + 1].getTitle(),
							itemsOrdered[i + 1].getCategory(), itemsOrdered[i + 1].getDirector(),
							itemsOrdered[i + 1].getLength(), itemsOrdered[i + 1].getCost());

				}
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

	public void displayCart() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
}