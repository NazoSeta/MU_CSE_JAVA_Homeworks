
public class Payroll {
	
	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	// In this class we create a payroll object for the employees that work for the factory.
	
	private int workHour;
	private int itemCount;
	
	// This constructor comes with the workHour and itemCount values of the employee, to use it for the methods of the object.
	public Payroll(int workHour, int itemCount) {
		this.workHour = workHour;
		this.itemCount = itemCount;
	}
	
	// Here we calculate the salary of an employee.
	public int calculateSalary() {
		return ((workHour * 3) + (itemCount * 2));
	}
	
	// This part is to represent the hours and the items an employee has produced in a String data type.
	public String toString() {
		return ("The work hour is " + workHour + " and the produced item count is " + itemCount + ".");
	}
	
	// Here we create the getter and setter methods for the data fields that are used in this class. 

	public int getWorkHour() {
		return workHour;
	}

	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
}
