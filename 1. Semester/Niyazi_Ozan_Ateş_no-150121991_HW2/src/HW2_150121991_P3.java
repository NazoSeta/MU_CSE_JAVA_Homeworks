
import java.util.Scanner;

public class HW2_150121991_P3 {

    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* We will write a program that calculates the personal income tax based on the given tax rates
	   reported by the Turkish Revenue Administration. The tax  rates vary every year.
	   We will ask the user for:
	   -The year of the income (year) (2017-2020)
	   -The amount of income (income)
	   We will calculate and output:
	   -The amount of income (income)
	   -The tax amount (tax)
	   -The income after tax (newIncome)
	   -The real tax rate (taxRate) */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//We will ask the user to enter a year and the income of that year.
		int year = input.nextInt();
		double income = input.nextDouble();
		double tax=0, newIncome, taxRate;
		//Here we will first check if there are any invalid values and if there is so we give them a warning.
		if ( (year<2017 || year>2020) || income<=0) {
		if (year<2017 || year>2020)
			System.out.println("Undefined year value");
		if (income<=0)
			System.out.println("Income must be > 0");
		}
		//If there are no invalid values we will go over to the calculation and the outputs.
		else {
			if (year == 2017) { //Here we will find the tax amount if the year is 2017
			if (income<13000)
				tax = income*0.15;
			else if (income<30000)
				tax = 1950 + (income-13000)*0.20;
			else if (income<110000)
				tax = 5350 + (income-30000)*0.27;
			else tax = 26950 + (income-110000)*0.35;
			}
			if (year == 2018) { //Here we will find the tax amount if the year is 2018
				if (income<14800)
					tax = income*0.15;
				else if (income<34000)
					tax = 2220 + (income-14800)*0.20;
				else if (income<120000)
					tax = 6060 + (income-34000)*0.27;
				else tax = 29280 + (income-120000)*0.35;
			}
	     	if (year == 2019) { //Here we will find the tax amount if the year is 2019
	     		if (income<18000)
	     			tax = income*0.15;
	     	    else if (income<40000)
	     	    	tax = 2700 + (income-18000)*0.20;
	     	    else if (income<148000)
	     	    	tax = 7100 + (income-40000)*0.27;
	     	    else if (income<500000)
	     	    	tax = 36260 + (income-148000)*0.35;
	     	    else tax = 159460 + (income-500000)*0.40;
	     	}
	     	if (year == 2020) { //Here we will find the tax amount if the year is 2020
	     		if (income<22000)
	     			tax = income*0.15;
	     		else if (income<49000)
	     			tax = 3300 + (income-22000)*0.20;
	     		else if (income<180000)
	     			tax = 8700 + (income-49000)*0.27;
	     		else if (income<600000)
	     			tax = 44070 + (income-180000)*0.35;
	     		else tax = 191070 + (income-600000)*0.40;
	     	}
		
		//Now that we know what the tax amount is, we can calculate the income after tax (newIncome) and the real tax rate (taxRate)
		newIncome = income - tax;
		taxRate = tax/income;
		
		/*Here we finally got all the values to give the user a output with the following:
		  Income, Tax amount, Income after tax, Real tax rate. */
		System.out.println("Income: " + (int)(income*100)/100.0);
		System.out.println("Tax amount: " + (int)(tax*100)/100.0);
		System.out.println("Income after tax: " + (int)(newIncome*100)/100.0);
		System.out.println("Real tax rate: " + (int)(taxRate*10000)/100.0 + "%");
		}
		
        input.close();
	}

}
