
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
			System.out.println("The disc " + disc.getTitle() + " has been added");
		}
		else {
			System.out.println("The cart is almost full");
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
		    
		    System.out.println("The disc has been removed");
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
}
