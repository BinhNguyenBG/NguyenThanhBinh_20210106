package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book extends Media {

	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {}
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, float cost) {
		super(title, cost);
	}
	
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}
	
	public void addAuthor(String authorName) {
		if (authors.contains(authorName)){
			System.out.println("Already exists");
		} else {
			authors.add(authorName);
		}
	}
	
	
	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)){
			authors.remove(authorName);
		} else {
			System.out.println("Not exist");
		}
	}
	
	@Override
	public String toString() {
		return ("Book - " + super.getTitle() + " - " + super.getCategory() + ": " + super.getCost()+"$");
	}

}
