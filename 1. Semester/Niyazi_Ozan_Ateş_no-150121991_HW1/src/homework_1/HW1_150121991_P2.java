package homework_1;

import java.util.Scanner;

public class HW1_150121991_P2 {
	
	// Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* We will write a program that converts days that has been entered to a years, months and days format. */ 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asking for the user to enter values.
		System.out.print("Number of days: ");
		int numberOfDays = input.nextInt();
		int years, months, days;
		
		//Calculating years, months and days.
		years = numberOfDays/365;
		months = (numberOfDays%365)/31;
		days = ((numberOfDays%365)%31);
		
		//Giving output to the user.
		System.out.println("Year: " + years + ", Month:" + months + ", Day:" + days);
		
        input.close();
	}

}
