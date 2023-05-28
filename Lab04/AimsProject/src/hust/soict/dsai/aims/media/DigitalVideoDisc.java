package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc() {}
	
	public DigitalVideoDisc(String title){
		super(title);
	}
	
	public DigitalVideoDisc(String title, float cost) {
		super(title, cost);
	}
	
	public DigitalVideoDisc(String title, String category, float cost){
		super(title, category, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost){
		super(title, category, director, cost);
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost){
		super(title, category, director, length, cost);
	}
	
	@Override
	public String toString() {
		return ("DVD - " + super.getTitle() + " - " + super.getCategory() + " - " + super.getDirector() + " - " + super.getLength() +": " + super.getCost()+"$");
	}
	
	@Override
	public void play() {
		if (super.getLength() > 0) {
			System.out.println("Playing DVD: " + super.getTitle());
			System.out.println("DVD length: " + super.getLength());
		} else {
			System.out.println("The DVD " + super.getTitle() + " cannot be played");
		}
	}

}
