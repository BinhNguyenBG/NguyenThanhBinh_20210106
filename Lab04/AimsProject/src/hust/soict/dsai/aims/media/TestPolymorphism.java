package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Media> mediae = new ArrayList<Media>();
		
		Book book = new Book("Calculus");
		CompactDisc cd = new CompactDisc("Calculus");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars");
		
		mediae.add(book);
		mediae.add(cd);
		mediae.add(dvd);
		
		for (Media element: mediae) {
			System.out.println(element.toString());
		}
		
	}

}
