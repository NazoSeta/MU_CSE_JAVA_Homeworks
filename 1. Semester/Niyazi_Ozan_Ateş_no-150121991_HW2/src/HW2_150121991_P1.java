
import java.util.Scanner;

public class HW2_150121991_P1 {

    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* We will write a program that checks the ISBN-10. We will ask the first 9 numbers (a-i) of the ISBN-10 number
	   from the user, and we will return a the ISBN-10 number back by finding the 10th figure (j). */
	
	public static void main(String[] args) {
     	Scanner input = new Scanner(System.in);
		
     	// Here we ask the user to enter their first 9 digits of an ISBN-10 as integer.
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int isbn = input.nextInt();

		// Here do we separate the first 9 digits in order.
        int a = isbn/100000000;
        int b = isbn%100000000/10000000;
        int c = isbn%10000000/1000000;
        int d = isbn%1000000/100000;
        int e = isbn%100000/10000;
        int f = isbn%10000/1000;
        int g = isbn%1000/100;
        int h = isbn%100/10;
        int i = isbn%10/1;
       
        // By using the formula given below we find the 10th digit (j) of the ISBN-10
        int j = (a*1 + b*2 + c*3 + d*4 + e*5 + f*6 + g*7 + h*8 + i*9)%11;
        
        // Displaying the 10 figure ISBN-10 number to the user.
        if (j == 10)
        	 System.out.println("The ISBN-10 number is " + a + b + c + d + e + f + g + h + i + "X");
        else
        	System.out.println("The ISBN-10 number is " + a + b + c + d + e + f + g + h + i + j);

        input.close();
	}

}
