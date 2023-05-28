package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	
	private String artist;
	private ArrayList<Track> tracks;
	
	public CompactDisc() {}
	
	public CompactDisc(String title) {
		super(title);
	}
	
	public CompactDisc(String title, float cost) {
		super(title, cost);
	}

	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public CompactDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
	}
	
	public CompactDisc(String title, String artist, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track trackName) {
		if (tracks.contains(trackName)) {
			System.out.println("This track is already exists in this disc");
		} else {
			tracks.add(trackName);
		}
	}
	
	public void removeTrack(Track trackName) {
		if (tracks.contains(trackName)) {
			tracks.remove(trackName);
		} else {
			System.out.println("This track is not in this disc");
		}
	}
	
	@Override
	public int getLength() {
		int res = 0;
		for (Track element: tracks) {
			res += element.getLength();
		}
		return res;
	}
	
	@Override
	public String toString() {
		return ("CD - " + super.getTitle() + " - " + this.artist + " - " + super.getCategory() + " - " + super.getDirector() + " - " + super.getLength() +": " + super.getCost()+"$");
	}
	
	@Override
	public void play() {
		System.out.println("CD artist: " + this.artist);
		System.out.println("Total length: " + this.getLength());
		for (Track element: tracks) {
			System.out.println("Playing track: " + element.getTitle());
			System.out.println("Track length: " + element.getLength());
		}
	}
	
}
