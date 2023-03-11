
import java.util.Scanner;

public class HW2_150121991_P2 {

    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* In this program we will find the day of the week by using the Zeller’s congruence.
	   We will take the inputs:
	   -The year. (y) NOT: y is the year of the century.
	   -The month. (m) NOT: January and February are counted as months 13 and 14 of the previous year.
	   -The day of the month (f)
	   We will calculate:
	   -The century. (c)
	   -The day of the week. (d) NOT: (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
	   Give a output of:
	   -The day of the week. (d) NOT: (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Asking the user to give some values to find the day of the week (d).
		System.out.print("Enter year (e.g. 2012): ");
        int y = input.nextInt();
        System.out.print("Enter month (e.g. 1-12): ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month (e.g. 1-31): ");
        int f = input.nextInt();
        int c, d;
        
        if (m < 3) {
        // NOT: January and February are counted as months 13 and 14 of the previous year.
        	m = m + 12;
            y = y - 1;
        }
        
        //Here we will calculate the century (c), The year of the century (y) and the day of the week (d),
        y = y%100;
        c = y/100;
        d = (f + 26*(m + 1)/10 + y + y/4 + c/4 + 5*c)%7;
       
        /* Giving the day of the week to the user as an output.
        NOT: (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday). */
        switch (d) {
        case 0: System.out.println("Day of the week is Saturday");
        break;
        case 1: System.out.println("Day of the week is Sunday");
        break;
        case 2: System.out.println("Day of the week is Monday");
        break;
        case 3: System.out.println("Day of the week is Tuesday");
        break;
        case 4: System.out.println("Day of the week is Wednesday");
        break;
        case 5: System.out.println("Day of the week is Thursday");
        break;
        case 6: System.out.println("Day of the week is Friday");
        break;
        }
 
        input.close();
	}

}
