package homework_1;

import java.util.Scanner;

public class HW1_150121991_P1 {
	
    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
    /* We will display the cost of a trip for an user that prompts the following values:
     -Distance that is driven,
     -The usage of fuel that the car burns in miles per gallon,
     -Price per gallon. */
     
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        //Asking user to enter values.
		System.out.print("Enter the driving distance: ");
        double driving_Distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double miles_Per_Gallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price_Per_Gallon = input.nextDouble();
        double total_Cost;
      
        //Calculating 'total_Cost'.
        total_Cost = driving_Distance/miles_Per_Gallon*price_Per_Gallon;

        //Output for the user.
        System.out.println("The cost of driving is $" + (int)(total_Cost*100)/100.0);
        
        input.close();
	}

}
