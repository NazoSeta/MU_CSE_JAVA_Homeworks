import java.util.Scanner;

public class HW4_Q1_150121991 {
	
    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* We will write a program that calculates the invoice of each flat in an apartment building.
	   We assume that there are N flats in a building and the apartment heating is the central system.
	   The bill will be in two parts. 30% of the bill will be shared equally among the flats.
	   The other 70% of the bill will be shared according to the consumption of each flat. */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt(); // Here we let the user enter a number of flats.
		double[] flats = new double[N];
		
		for (int i = 0 ; i < N ; i++) // Here we let the user enter the consumption of the flats.
			flats[i] = input.nextDouble();
		
		double totalBill = input.nextDouble(); // Here we let the user enter the total bill.
		calculateTheInvoice(flats, totalBill);
		
		printBills(flats);
		input.close();
		}

	public static double[] calculateTheInvoice (double[] flats, double totalBill) {
		// In this part of the method we calculate the bills each flat has to pay.
		double thirty = totalBill*0.3;
		double seventy = totalBill*0.7;
		double totalComsumption = 0;
		
		for (int i = 0 ; i < flats.length ; i++)
			totalComsumption += flats[i];
		
		for (int i = 0 ; i < flats.length ; i++) 
			flats[i] = (seventy*flats[i]/totalComsumption + thirty/flats.length);
		
		return flats;
	}
	
	public static void printBills (double[] bills) {
		// This is the part where we give the user his outputs.
		for (int i = 0; i < bills.length ; i++)
			System.out.println("Flat #" + (i+1) + ": " + ((int)(bills[i]*100))/100.0);
	}
	
}
