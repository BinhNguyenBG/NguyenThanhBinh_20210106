package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private int id;
	private static int nbDigitalVideoDiscs = 0;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public int getId() {
		return id;
	}
	
	public int getNbDigitalVideoDiscs(){
		return nbDigitalVideoDiscs;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String title){
		this.title = title;
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, float cost){
		this(title);
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost){
		this(title, category, cost);
		this.director = director;
		this.id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost){
		this(title, category, director, cost);
		this.length = length;
		this.id = nbDigitalVideoDiscs;
	}
	
	@Override
	public String toString() {
		return ("DVD - " + this.title + " - " + this.category + " - " + this.director + " - " + this.length +": " + this.cost+"$");
	}
	
	
}
