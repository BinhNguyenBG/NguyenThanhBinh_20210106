package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	
	
	public DigitalVideoDisc[] getItemOrdered() {
		return itemOrdered;
	}

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public static int getMaxNumbersOrdered() {
		return MAX_NUMBERS_ORDERED;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc " + disc.getTitle() + " has been added to cart");
		}
		else {
			System.out.println("The cart is almost full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < dvdList.length; i++) {
				itemOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered++;
				System.out.println("The disc " + dvdList[i].getTitle() + " has been added to cart");
			}
		}
		else {
			System.out.println("The cart is already full.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = dvd1;
			itemOrdered[qtyOrdered+1] = dvd2;
			qtyOrdered += 2;
			System.out.println("The disc " + dvd1.getTitle() + " has been added to cart");
			System.out.println("The disc " + dvd2.getTitle() + " has been added to cart");
		}
		else {
			System.out.println("The cart is already full.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int indexToRemove = -1;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].equals(disc)){
				indexToRemove = i;
				break;
			}
		}
		
		if (indexToRemove != -1) {
		    DigitalVideoDisc[] copy = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		    System.arraycopy(itemOrdered, 0, copy, 0, indexToRemove);
		    System.arraycopy(itemOrdered, indexToRemove + 1, copy, indexToRemove, itemOrdered.length - indexToRemove - 1);
		    this.itemOrdered = copy;
		    qtyOrdered--;
		    
		    System.out.println("The disc " + itemOrdered[indexToRemove].getTitle() + " has been removed from cart");
		} else {
		    System.out.println("Disc not found");
		}
	}
	
	public float totalcost() {
		float cost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			cost += itemOrdered[i].getCost();
		}
		return cost;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 1; i <= qtyOrdered; i++) {
			System.out.println(String.format("%d", i) + "." + itemOrdered[i-1].toString());
		}
		System.out.println("Total cost: " + this.totalcost());
		System.out.println("***************************************************");
	}
	
	public void searchId(int id) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getId() == id) {
				System.out.println(itemOrdered[i].toString());
				return;
			}
		}
		System.out.println("No match is found");
		return;
	}
	
	public void searchTitle(String title) {
		for (int i =0; i < qtyOrdered; i++) {
			if (itemOrdered[i].getTitle().equals(title)) {
				System.out.println(itemOrdered[i].toString());
				return;
			}
		}
		System.out.println("No match is found");
		return;
	}
}
