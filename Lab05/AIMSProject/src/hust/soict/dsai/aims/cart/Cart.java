package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.exception.*;
import hust.soict.dsai.aims.media.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public void addMedia(Media medium) throws CartFullException {
		if (this.itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			throw new CartFullException("The cart is full.");
		} else {
			this.itemsOrdered.add(medium);
			System.out.println(medium.getTitle() + " has beed added to the cart.");
		}
	}
	
	public void removeMedia(Media medium) throws NonExistingItemException {
		if (this.itemsOrdered.remove(medium)) {
			System.out.println(medium.getTitle() + " has been removed from the cart.");
		} else {
			throw new NonExistingItemException(medium.getTitle() + " is not in the cart.");
		}
	}
	
	public float totalCost() {
		float cost = 0.0f;
		for (Media medium: itemsOrdered) {
			cost += medium.getCost();
		}
		return cost;
	}
	
	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered Items:");
		for (Media media: this.itemsOrdered) {
			System.out.println(media.toString());
		}
		System.out.println("Total cost: " + "$" + this.totalCost());
		System.out.println("***************************************************");
		System.out.println("\n");
	}
	
	public boolean filterMedia(int id) {
		boolean found = false;
		int qty = 0;
		float cost = 0f;
		System.out.println("\n******************SEARCH RESULT********************");
		System.out.println("Product ID: " + id);
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			if (this.itemsOrdered.get(i).getID() == id) {
				System.out.println(Integer.toString(i+1) + "." + "\t" + this.itemsOrdered.get(i).toString() + "\n");
				qty += 1;
				cost = this.itemsOrdered.get(i).getCost();
				found = true;
			}
		}
		if (found) {
			System.out.println("Total number of product " + id + " found: " + qty);
			System.out.println("Total cost for these product: " + "$" + (cost*qty));
			System.out.println("***************************************************");
			System.out.println("\n");
			return true;
		} else {
			System.out.println("Such product is not in the cart");
			System.out.println("***************************************************");
			System.out.println("\n");
			return false;
		}
	}
	
	public boolean filterMedia(String title) {
		boolean found = false;
		int qty = 0;
		float cost = 0f;
		System.out.println("\n******************SEARCH RESULT********************");
		System.out.println("Product title: " + title);
		for (int i = 0; i < this.itemsOrdered.size(); i++) {
			if (this.itemsOrdered.get(i).search(title)) {
				System.out.println(Integer.toString(i+1) + "." + "\t" + this.itemsOrdered.get(i).toString() + "\n");
				qty += 1;
				cost = this.itemsOrdered.get(i).getCost();
				found = true;
			}
		}
		if (found) {
			System.out.println("Total number of product " + title + " found: " + qty);
			System.out.println("Total cost for these product: " + "$" + (cost*qty));
			System.out.println("***************************************************");
			System.out.println("\n");
			return true;
		} else {
			System.out.println("Such product is not in the cart");
			System.out.println("***************************************************");
			System.out.println("\n");
			return false;
		}
	}
	
	public Media searchMedia(String title) {
		for (Media media: this.itemsOrdered) {
			if (media.getTitle().toLowerCase().equals(title.toLowerCase())) {
				return media;
			}
		}
		return null;
	}
	
	
	
	public void sortByTitle() {
		FXCollections.sort(this.itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCost() {
		FXCollections.sort(this.itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
	
	public ObservableList<Media> getItemsOrdered() {
		return this.itemsOrdered;
	}
	
	public int getQtyOrdered() {
		return this.itemsOrdered.size();
	}
	
	
}