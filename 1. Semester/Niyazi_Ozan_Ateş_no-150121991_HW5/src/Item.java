
public class Item {
	
	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	// This class create an object of the items that is produced by the employees of a factory.

	private int id;
	public static int numberOfItems;
	
	// This constructor keeps the id of the object that is created and increment each time the numberOfItems that are produced.
	public Item(int id) {
		this.id = id;
		numberOfItems++;
	}
	
	// Here we create the getter and setter methods for the data fields that are used in this class. 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNumberOfItems() {
		return numberOfItems;
	}

	public static void setNumberOfItems(int numberOfItems) {
		Item.numberOfItems = numberOfItems;
	}
	
}
