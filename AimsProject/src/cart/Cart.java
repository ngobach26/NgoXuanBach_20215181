package cart;

import java.util.ArrayList;

import media.Media;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	public void displayCart() {
		StringBuffer sb = new StringBuffer("\n***********************CART***********************\nOrdered Items:");
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			sb.append("\n" + (i + 1) + ".Media - " + itemsOrdered.get(i).getTitle() + " - "
					+ itemsOrdered.get(i).getCategory() + " - "
					+ (itemsOrdered.get(i).getCost() == 0 ? "Unknown" : itemsOrdered.get(i).getCost()) + "$");
		}
		sb.append("\nTotal cost: " + this.totalCost());
		sb.append("\n***************************************************");
		System.out.println(sb);

	}

	// public void searchById(int id) {
	// 	Integer j = Integer.valueOf(id);
	// 	for (int i = 0; i < this.qtyOrdered; i++) {
	// 		if (j.equals(itemsOrdered[i].getId())) {
	// 			System.out.println("\nID:" + itemsOrdered[i].getId() + " - DVD - " + itemsOrdered[i].getTitle() + " - "
	// 					+ itemsOrdered[i].getCategory() + " - "
	// 					+ itemsOrdered[i].getDirector() + " - "
	// 					+ (itemsOrdered[i].getLength() == 0 ? "Unknown" : itemsOrdered[i].getLength()) + " : "
	// 					+ (itemsOrdered[i].getCost() == 0 ? "Unknown" : itemsOrdered[i].getCost()) + "$");
	// 			return;
	// 		}
	// 	}
	// 	System.out.println("Item not found");
	// }

	// public void searchByTitle(String title) {
	// 	for (int i = 0; i < this.qtyOrdered; i++) {
	// 		if (title.equals(itemsOrdered[i].getTitle())) {
	// 			System.out.println("\nID:" + itemsOrdered[i].getId() + " - DVD - " + itemsOrdered[i].getTitle() + " - "
	// 					+ itemsOrdered[i].getCategory() + " - "
	// 					+ itemsOrdered[i].getDirector() + " - "
	// 					+ (itemsOrdered[i].getLength() == 0 ? "Unknown" : itemsOrdered[i].getLength()) + " : "
	// 					+ (itemsOrdered[i].getCost() == 0 ? "Unknown" : itemsOrdered[i].getCost()) + "$");
	// 			return;
	// 		}
	// 	}
	// 	System.out.println("Item not found");
	// }



	public void addMedia(Media media){
		if(itemsOrdered.size() == 20){
			System.out.println("The Cart is full!!");
		}else{
			itemsOrdered.add(media);
			System.out.println("The " + media.getClass().getName()+" " + media.getTitle() + " have been added!");
		}
	}

	

	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " have been removed!");
		} else {
			System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " is not in the cart!");
		}
	}
	

	public float totalCost() {
		float sum = 0.0f;
		for (Media media:itemsOrdered) {
			sum += media.getCost();
		}
		return sum;
	}

}