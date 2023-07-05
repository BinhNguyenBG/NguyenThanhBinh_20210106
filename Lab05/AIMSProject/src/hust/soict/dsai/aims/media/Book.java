package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.*;

public class Book extends Media {
	
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Book(String title, float cost) {
		super(title, cost);
	}

	public Book(String title) {
		super(title);
	}
	
	public void addAuthor(String authorName) throws DupplicatedItemException {
		for (String name: this.authors) {
			if (name.toLowerCase().equals(authorName.toLowerCase())) {
				throw new DupplicatedItemException(name + " is already in the list of authors.");
			}
		}
		this.authors.add(authorName);
		System.out.println(authorName + " has been added to the " + this.getTitle() + " list of authors.");
	}
	
	
	public void removeAuthor(String authorName) throws NonExistingItemException {
		for (String name: this.authors) {
			if (name.toLowerCase().equals(authorName.toLowerCase())) {
				this.authors.remove(name);
				System.out.println(name + " has been removed from the " + this.getTitle() + " list of authors.");
				return;
			}
		}
		throw new NonExistingItemException(authorName + " is not in the list of authors.");
	}
	
	@Override
	public String toString() {
		StringBuffer authorsList = new StringBuffer();
		if (this.authors.size() >= 1) {
			authorsList.append(this.authors.get(0));
			for (int i = 1; i < this.authors.size(); i++) {
				authorsList.append(", " + this.authors.get(i));
			}
		}
		return ("Product ID: " + String.valueOf(this.getID())
		+ "\n" + "\t" + "Title: " + this.getTitle()
		+ "\n" + "\t" + "Category: " + this.getCategory()
		+ "\n" + "\t" + "Authors: " + authorsList
		+ "\n" + "\t" + "Price: $" + String.valueOf(this.getCost()));
	}

}