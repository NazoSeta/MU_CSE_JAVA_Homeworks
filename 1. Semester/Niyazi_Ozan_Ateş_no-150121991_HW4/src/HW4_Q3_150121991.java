import java.util.Scanner;

public class HW4_Q3_150121991 {
	
    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* In this program we will create a diamond shape.
	   We do this by asking the user to enter a letter and by using the alphabetic order
	   we will create the diamond shape and the length of it. */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Letter: "); // Here we ask the user to enter a letter.
		String letter = input.next();
		boolean check = true;

		if (letter.length() != 1) { // We check if the length is a length of one.
			check = false;
		}
		// Here we check if it is a letter
		if (!((letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z') || (letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z'))) {
			check = false;
		}
		if (check) {
			letter = letter.toUpperCase(); // If it is a lower case letter we make it to an upper case letter.
			int length = (letter.charAt(0) - 'A' + 1);
			char [][] diamond = new char [length*2 - 1][length*2 - 1];
			
			diamond = constructDiamond(letter.charAt(0)); // We create the diamond shape in this method.
			printDiamond(diamond); // In this method we print out the diamond shape.
		}
		else {
			System.out.println("Invalid Input !");
		}
		 input.close();
	}

	public static char[][] constructDiamond (char letter) {
		int length = (letter - 'A' + 1);
		char [][] diamond = new char [length*2 - 1][length*2 - 1];
		// First we create a plane for the diamond.
		for (int i = 0 ; i < (length*2 - 1) ; i++) {
			for (int j = 0 ; j < (length*2 - 1) ; j++) {
				diamond [i][j] = '.';
			}
		} // Here we fill the diamond on the plane we created.
		for (int i = 0 ; i < length ; i++) {
				diamond [i][length - 1 - i] = (char)('A' + i);
				diamond [i][length - 1 + i] = (char)('A' + i);
				diamond [length*2 - 2 - i][length - 1 - i] = (char)('A' + i);
				diamond [length*2 - 2 - i][length - 1 + i] = (char)('A' + i);
		} 
		return diamond;
	}
	
	public static void printDiamond (char[][] diamond) {
		// Here we print out the diamond for the user.
		for (int i = 0 ; i < diamond.length ; i++) {
			for (int j = 0 ; j < diamond[0].length ; j++) {
				System.out.print(diamond[i][j]);
			}
			System.out.println("");
		}
	}
	
}
