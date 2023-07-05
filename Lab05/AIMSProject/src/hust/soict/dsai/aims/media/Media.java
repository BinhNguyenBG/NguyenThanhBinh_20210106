package hust.soict.dsai.aims.media;
import java.time.LocalDate;
import java.util.Comparator;

public abstract class Media {
	private String title;
	private String category;
	private float cost;
	private int id;
	private static int nbMedia;
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();


	public Media(String title) {
		this.title = title;
		nbMedia++;
		this.id = nbMedia;
	}
	
	public Media(String title, float cost) {
		this(title);
		this.cost = cost;
	}
	
	public Media(String title, String category, float cost) {
		this(title);
		this.category = category;
		this.cost = cost;
	}


	public int getID() {
		return id;
	}

	public String getTitle() {
		return title;
	}


	public String getCategory() {
		return category;
	}


	public float getCost() {
		return cost;
	}
	
	public boolean equals(Object medium) {
		if (medium instanceof Media) {
			try {
				Media that = (Media) medium;
				return this.title.toLowerCase().equals(that.getTitle().toLowerCase());
			} catch (NullPointerException e1) {
				return false;
			} catch (ClassCastException e2) {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean search(String title) {
		return this.title.toLowerCase().contains(title.toLowerCase());
	}
	
	public abstract String toString();

}