import java.util.Scanner;

public class HW4_Q2_150121991 {

     // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
     /* In this program we will determine whether or not a number is valid per the Luhn formula.
        The Luhn algorithm is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers.
        We will check if the given string is valid. */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.nextLine(); // Here we ask the user to enter a number.
		boolean check = true;
		
		if (number.length() <= 1) { // We check if the number that has enter is bigger than 1
		    check = false;
		}
		for (int i = 0 ; i < number.length() ; i++) { // We check if its a number or a blanked space.
			if (!((number.charAt(i) <= '9' && number.charAt(i) >= '0') || number.charAt(i) == ' '))
				check = false;
		}
		if (check) { // If the its a number and its longer then two digits we can go over to check if the number itself is valid.
		if (validateNumber(number)) // Giving the user some outputs.
			System.out.println("Number is Valid");
		else
			System.out.println("Number is Invalid");
		}
		else
			System.out.println("Invalid Input !");
		 input.close();
	}

	public static boolean validateNumber (String number) {
		String DNumber = ("");
		String LNumber = ("");
		String newNumber = ("");
		int temp = 0;
		
		// In this part we create the same number but we remove the spaces.
		for (int i = 0 ; i < number.length() ; i++) {
		    if (number.charAt(i) <= '9' && number.charAt(i) >= '0')
		    	newNumber = (newNumber + number.charAt(i));
		}
		if (newNumber.length()%2 == 0) { // For this part of our code we check the length and by checking we choose which code we use.
		for (int i = 0 ; i < newNumber.length() ; i++) { // This part of the code is to find the DNumber and LNumber.
			temp = (newNumber.charAt(i) - '0');
				if (i%2 == 0) {
					DNumber = (DNumber + newNumber.charAt(i));
					if (temp * 2 > 9)
						LNumber = LNumber + (temp * 2 - 9);
					else
						LNumber = LNumber + (temp * 2);
				}
				else {
					DNumber = (DNumber + "_");
			    	LNumber = LNumber + (newNumber.charAt(i));
				}
			}
		}
	    else { // If the number can not be divided by two we come to this part.
		for (int i = 0 ; i < newNumber.length() ; i++) { // This part of the code is to find the DNumber and LNumber.
			temp = (newNumber.charAt(i) - '0');
			if (i%2 == 0) {
				DNumber = (DNumber + "_");
		       	LNumber = LNumber + (newNumber.charAt(i));
			}
			else  {
				DNumber = (DNumber + newNumber.charAt(i));
				if (temp * 2 > 9)
					LNumber = LNumber + (temp * 2 - 9);
				else
					LNumber = LNumber + (temp * 2);
				}	
		}
	    }
			
		int total = 0;
		for (int i = 0 ; i < newNumber.length() ; i++) { // Here we create the total sum of all digits to use it later.
			total = total + (LNumber.charAt(i) - '0');
		}
		// Giving the user some outputs.
		System.out.println("DNumber:" + DNumber);
		System.out.println("LNumber:" + LNumber);
		
		if (total%10 != 0) // If the total can't not be divided by 10 its a invalid number.
			return false;
		
		return true;
	}
	
}
