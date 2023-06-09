package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new cart
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Jungle");
		
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Cinderella");

		
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3, dvd4, dvd5};
		anOrder.addDigitalVideoDisc(dvdList);
		
		anOrder.print();
		
	}

}
