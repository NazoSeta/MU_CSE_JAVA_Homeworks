package homework_1;

import java.util.Scanner;

public class HW1_150121991_P3 {

	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* We will calculate the compound monthly interest.
	   By calculating this we will ask the user to enter the values for:
	 -Ýnitial principal amount (a),
	 -Annual interest rate percentage (b),
	 -Number of time periods in months (c),
	   and calculates the corresponding
	 -Ýnitial principal amount (a)
	 -Monthly interest rate percentage (b/12),
	 -Total compound interest amount (d),
	 -Final balance amount (e), */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asking user to enter values.
		System.out.print("Enter initial principal amount: ");
		double a = input.nextDouble();
		System.out.print("Enter annual interest rate (e.g. 9.45): ");
		double b = input.nextDouble();
		System.out.print("Enter number of time periods in months: ");
		double c = input.nextDouble();
		
		double d;
		double e;		
		
		//Calculating 'Final balance amount' and 'Total compound interest amount'.
		e = a*Math.pow(1+b/1200, c);	
		d = e - a;
		
		//Outputs for the user.
		System.out.println(" ");
		System.out.println("Initial principal amount: " + (int)(a*100)/100.0);
		System.out.println("Monthly interest rate: " + (int)((b/12)*100)/100.0);
		System.out.println("Total compound interest amount: " + (int)(d*100)/100.0);
		System.out.println("Final balance amount: " + (int)(e*100)/100.0);
		
		input.close();
	}

}
