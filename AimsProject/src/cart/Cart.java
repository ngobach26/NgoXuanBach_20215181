package cart;

import java.util.ArrayList;

import media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n***********************CART***********************\nOrdered Items:");
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			sb.append("\n" + (i + 1) + ".Media - " + itemsOrdered.get(i).getTitle() + " - "
					+ itemsOrdered.get(i).getCategory() + " - "
					+ (itemsOrdered.get(i).getCost() == 0 ? "Unknown" : itemsOrdered.get(i).getCost()) + "$");
		}
		sb.append("\nTotal cost: " + this.totalCost());
		sb.append("\n***************************************************");
		return sb.toString();
	}


	public void addMedia(Media media) {
		if (itemsOrdered.size() == 20) {
			System.out.println("The Cart is full!!");
		} else {
			itemsOrdered.add(media);
			System.out.println("The " + media.getClass().getName() + " " + media.getTitle() + " have been added!");
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
		for (Media media : itemsOrdered) {
			sum += media.getCost();
		}
		return sum;
	}
	public void sortCartByTitleCost(){
		this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
	}

	public void sortCartByCostTitle(){
		this.itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
	}

	public Media findMediaByTitle(String title) {
		for (Media media : itemsOrdered) {
			if (media.getTitle().equalsIgnoreCase(title)) {
				return media;
			}
		}
		return null;
	}
	
	public Media findMediaById(int id) {
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				return media;
			}
		}
		return null;
	}
	

}