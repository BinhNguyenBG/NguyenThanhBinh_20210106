package hust.soict.dsai.aims.media;
import java.util.Comparator;

public abstract class Media {
	private int id;
	private String category;
	private String title;
	private float cost;
	
	private static int nbMedia;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public Media() {}
	
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

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Media) {
			Media media = (Media) obj;
			if (this.title == media.getTitle()) {
				return true;
			}
		}
		return false;
		
	}
}
