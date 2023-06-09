package hust.soict.dsai.aims.media;

public class Disc extends Media{
	
	private int length;
	private String director;
	
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
	protected Disc() {}
	
	protected Disc(String title) {
		super(title);
	}
	
	protected Disc(String title, float cost) {
		super(title, cost);
	}
	
	protected Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	protected Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	
	protected Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
}
