
public class Employee {
	
	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	// This class is to create an employee object for a factory.
	// We create the employee by asking for his id, name, surname, workHours and speed.
	
	private int id;
	private String name;
	private String surname;
	private int workHour;
	private int speed;
	private Item[] items;
	private Payroll payroll;
	
	// This constructor create an object employee for a factory.
	public Employee(int id, String name, String surname, int workHour, int speed) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.workHour = workHour;
		this.speed = speed;
	}
	
	// The method startShift() gives us the amount of items the employee produce during his work time.
	// Also we give each item he create a random id.
	public Item[] startShift() {
		items = new Item[workHour * speed];
		for (int i = 0 ; i < workHour * speed ; i++) {
			items[i] = new Item((int)(Math.random()*100));
		}
		return items;
	}
	
	// The method endShift() create the payroll of an employee by using the amount of hours he worked and the items he created.
	public Payroll endShift() {
		payroll = new Payroll(workHour, workHour*speed);
		return payroll;
	}
	
	// This part is to represent the id, speed, workHours and the total amount of items he created.
	// While we represent this we use the String data type and get help from the payroll.toString() method.
	public String toString() {
		return ("This is the employee with id " + id + " speed " + speed + ". " + payroll.toString());
	}
	
	// Here we create the getter and setter methods for the data fields that are used in this class.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Item[] getItems() {
		return items;
	}

	public void setItems(Item[] items) {
		this.items = items;
	}

	public Payroll getPayroll() {
		return payroll;
	}

	public void setPayroll(Payroll payroll) {
		this.payroll = payroll;
	}
	
}
