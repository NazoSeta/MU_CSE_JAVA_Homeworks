
public class Storage {
	
	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	// In this class we create an object that will be used as a storage for a factory.
	
	private int capacity;
	private Item[] items;
	
	// This constructor creates the capacity of a factory.
	public Storage(int capacity) {
		this.capacity = capacity;
	}
	
	// By using this method we add items that the employees create to the storage of the factory.
	// We use the '== null' if the items array has no length.
	// Otherwise we create a new array with a length that is 1 longer then before.
	// After copying every object in it we add the new item to the last part of the array.
	public void addItem(Item item) {
		if(items == null) {
            Item[] newArray = new Item[1];
            newArray[0] = item;
            items = newArray;
        }
		else {
			Item[] newArray = new Item[items.length + 1];
	        for(int i = 0 ; i < items.length ; i++) {
	            newArray[i] = items[i];
	        }
	        newArray[items.length] = item;
	        items = newArray;
		}
	}
	
	// Here we create the getter and setter methods for the data fields that are used in this class.

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}
	
}
