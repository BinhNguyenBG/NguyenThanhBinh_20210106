package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.*;
import hust.soict.dsai.aims.media.*;
import java.time.LocalDate;

public class Store {
	
	private int numMedia;
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public void addMedia(Media medium) throws DupplicatedItemException {
		if (this.itemsInStore.contains(medium) || medium.getTitle() == null) {
			throw new DupplicatedItemException();
		} else {
			this.itemsInStore.add(medium);
			System.out.println(medium.getTitle() + " has been added to the store.");
		}
	}
	
	public void removeMedia(Media medium) throws NonExistingItemException {
		if (this.itemsInStore.remove(medium)) {
			System.out.println(medium.getTitle() + " has been removed from the store.");
		} else {
			throw new NonExistingItemException(medium.getTitle() + " is not available at the store.");
		}
	}
	
	public Media searchMedia(String title) {
		for (Media media: this.itemsInStore) {
			if (media.getTitle().toLowerCase().equals(title.toLowerCase())) {
				return media;
			}
		}
		return null;
	}
	
	public void print() {
		System.out.println("\n");
		System.out.println("*************AVAILABLE MEDIA IN STORE**************");
//		for (int i = 0; i < itemsInStore.size(); i++) {
//			System.out.println(Integer.toString(i+1) + "." + "\t" + this.itemsInStore.get(i).getTitle() + "\t-\t" + this.itemsInStore.get(i).getType());
//		}
		for (Media media: this.itemsInStore) {
			System.out.println(media.toString());
		}
		System.out.println("***************************************************");
		System.out.println("\n");
	}
	
	public ArrayList<Media> getItemsInStore() {
		return this.itemsInStore;
	}
	
	public int getNumMedia() {
		return this.itemsInStore.size();
	}
}