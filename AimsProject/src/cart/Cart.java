package cart;

import java.util.ArrayList;

import helper.Helper;
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

	public void displayCart() {
		System.out.println(this.toString());
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

	public void sortCartByTitleCost() {
		this.itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
	}

	public void sortCartByCostTitle() {
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

	public void addMediaToCart() {
		System.out.println("ADD MEDIA TO CART");
		System.out.println("-----------------------------------");
		Media media = Helper.scanTitleFindMedia();
		addMedia(media);
	}

	public ArrayList<Media> filterMediaByTitle(String title) {
		ArrayList<Media> filteredMedia = new ArrayList<Media>();
		for (Media media : itemsOrdered) {
			if (media.getTitle().equalsIgnoreCase(title)) {
				filteredMedia.add(media);
			}
		}
		return filteredMedia;
	}

	public void displayFilterMediaByTitle() {
		System.out.println("FILTER MEDIA BY TITLE");
		System.out.println("-----------------------------------");
		String title = Helper.scanTitle();
		System.out.println(filterMediaByTitle(title).toString());
	}

	public ArrayList<Media> filterMediaById(int id) {
		ArrayList<Media> filteredMedia = new ArrayList<Media>();
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				filteredMedia.add(media);
			}
		}
		return filteredMedia;
	}

	public void displayFilterMediaById() {
		System.out.println("FILTER MEDIA BY ID");
		System.out.println("-----------------------------------");
		int id = Helper.scanID();
		System.out.println(filterMediaById(id).toString());
	}

	public void removeCartByID(){
        System.out.println("\nREMOVE CART BY ID");
		displayCart();
        int id = Helper.scanID();
        removeMedia(findMediaById(id));
	}
	public void removeCartByTitle() {
        System.out.println("\nREMOVE CART BY TITLE");
        displayCart();
        String title = Helper.scanTitle();
        removeMedia(findMediaByTitle(title));
    }

	public void placeOrder() {
		System.out.println("\nPLACE ORDER");
		System.out.println("-----------------------------------");
		itemsOrdered.clear();
		System.out.println("Thank you for your purchase!");
	}
	

}