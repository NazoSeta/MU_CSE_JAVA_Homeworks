
public class Factory {
	
	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	// In this class we create an object which represent a factory.
	// We use several methods in this class such as:
	// getRevenue(), getPaidSalaries(), addEmployee(Employee employee), removeEmployee(int id) and addPayroll(Payroll payroll).

	private	String name;
	private	Employee[] employees;
	private	Storage storage;
	private	Payroll[] payrolls;
	private	double itemPrice;
	
	// This constructor creates an object that will be used for a factory.
	public Factory(String name, int capacity, double itemPrice) {
		this.name = name;
		storage = new Storage(capacity);
		this.itemPrice = itemPrice;
	}
	
	// This method will get the revenue that the factory earned.
	public double getRevenue() {
		Item[] items = storage.getItems();
        if (items == null)
        	return 0.0;
        else 
        	return items.length * itemPrice;
	}
	
	// This method count the total amount of salary that is paid to the employees.
	public double getPaidSalaries() {
		double total = 0;
		if(payrolls == null)
			return total;
		else {
			for (int i = 0 ; i < payrolls.length ; i++) {
				total = total + payrolls[i].calculateSalary();
			}
		return total;
		}
	}
	
	// Here we add an employee to the factory to work
	// We will resize the array if we add an employee.
	public void addEmployee(Employee employee) {
		if (employees == null) {
			Employee[] tempArray = new Employee[1];
			tempArray[0] = employee;
			employees = tempArray;
			Item[] newItems = employee.startShift();
        	for (int i = 0; i < newItems.length; i++) {
        		storage.addItem(newItems[i]);
        	}
		}
		else {
			 Employee[] tempArray = new Employee[employees.length + 1];
		        for(int i = 0 ; i < employees.length ; i++) {
		            tempArray[i] = employees[i];
		        }
		        tempArray[employees.length] = employee;
		        employees = tempArray;
		        Item[] newItems = employee.startShift();
	        	for (int i = 0; i < newItems.length; i++) {
	        		storage.addItem(newItems[i]);
	        	}
		}
	}
	
	// Here we remove an employee with the given id that stopped working.
	// We will also give outputs if there are no employees or if the employee is not found.
	// If we remove the employee we will add his given salary to the payroll array.
	// We will resize the array if we remove an employee. Also we will resize the payrolls array.
	public Employee removeEmployee(int id) {
		if (employees == null) {
			System.out.println("There are no employees!");
		return null;
		}
		
		int employeeOnTheList = 0;
		boolean check = false;
		for (int i = 0 ; i < employees.length ; i++) {
			if (employees[i].getId() == id) {
				check = true;
				employeeOnTheList = i;
			}
		}
		     if (!check) {
		System.out.println("Employee does not exist!");
		return null;
		     }
		
	    Employee[] tempArray = new Employee[employees.length - 1];
		     for(int i = 0, j = 0 ; i < employees.length ; i++, j++) {
		    	 if (employees[i].getId() == id)
		    		 j--;
		    	 else
		             tempArray[j] = employees[i];
	    }
		
		addPayroll(employees[employeeOnTheList].endShift());
		
		employees = tempArray;
		return null;
	}
	
	private void addPayroll(Payroll payroll) {
		if(payrolls == null) {
			Payroll[] newPayroll = new Payroll[1];
			newPayroll[0] = payroll;
            payrolls = newPayroll;
        }
		else {
			Payroll[] newPayroll = new Payroll[payrolls.length + 1];
	        for(int i = 0 ; i < payrolls.length ; i++) {
	        	newPayroll[i] = payrolls[i];
	        }
	        newPayroll[payrolls.length] = payroll;
	        payrolls = newPayroll;
		}
	}
	
	// Here we create the getter and setter methods for the data fields that are used in this class.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Storage getStorage() {
		return storage;
	}

	public void setStorage(Storage storage) {
		this.storage = storage;
	}

	public Payroll[] getPayrolls() {
		return payrolls;
	}

	public void setPayrolls(Payroll[] payrolls) {
		this.payrolls = payrolls;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
