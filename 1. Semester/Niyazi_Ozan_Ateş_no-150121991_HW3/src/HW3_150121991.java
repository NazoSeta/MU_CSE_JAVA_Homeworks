import java.util.Scanner;

public class HW3_150121991 {

    // Name: Niyazi Ozan    Surname: Ateþ    no: 150121991
	/* In this program we will create a program that will draw some geometric shapes and equations on a coordinate system
	   The geometric shapes are rectangles and triangles.
	   The equations that we will create are lines, parabola and circle.
	   While creating these shapes and equations we ask the user first to choose which shape or equation
	   they want to create on the coordinate system.
	   After we know which shape or equation they want, we ask the user for some values to create a shape or equation they want to see. */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int shape = -1;
		
		while (shape != 6) {
		
		//Here we ask the user to choose which shape or equation they want to see on the coordinate system.
		System.out.println("Which shape would you like to draw?");
		System.out.println("1. Line");
		System.out.println("2. Triangle");
		System.out.println("3. Rectangle");
		System.out.println("4. Parabola");
		System.out.println("5. Circle");
		System.out.println("6.Exit");
		shape = input.nextInt();
		System.out.println("");
		
		//Here we will choose the which code we are going to use by using the switch-case
		switch (shape) {
		case 1: // Here the user have chosen to create a line in the coordinate system.
			System.out.println("Line formula is y = ax + b");
			System.out.print("Please enter the coefficients a and b:");
			int a = input.nextInt();
			int b = input.nextInt();
			
			int x;
			int y;
			
			System.out.println("");	
			
			// Here we create the graph for the line.
			for (y = 10 ; y >= -11 ; y-- ) {
				for (x = -10 ; x <= 11 ; x++) {
					int value = a*x + b;
					if (y == 0) {
						if (value == 0)
							System.out.print("*");
						else if (x == 0)
							System.out.print("|");
						else if (x == 11)
							System.out.print("x");
						else 
							System.out.print("-");
					}
					else if (value == y){
						System.out.print("*");
					}
					else if (x == 0) {
						if (y == 10)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else System.out.print(" ");
				}
				System.out.println("");
			}
			System.out.println("");	
			System.out.println("");	
			break;
		case 2: // Here the user have chosen to create a triangle in the coordinate system.
			System.out.println("For triangle, we need the coordinates of the points for three vertices.");
			System.out.print("Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
			a = input.nextInt();
			b = input.nextInt();
			int c = input.nextInt();
			int d = input.nextInt();
			int e = input.nextInt();
			int f = input.nextInt();
			
			int c1x = a;
			int c1y = b;
			int c2x = c;
			int c2y = d;
			int c3x = e;
			int c3y = f;
			
			// Here we choose the coordinates in a particular sequence from left to right
			if (a >= c && a >= e) {
				if (c >= e) {
					c1x = a;
					c1y = b;
			        c2x = c;
			        c2y = d;
			        c3x = e;
			        c3y = f;
				}
				else {
					c1x = a;
					c1y = b;
			        c2x = e;
			        c2y = f;
			        c3x = c;
			        c3y = d;
				}
			}
			else if (c >= a && c >= e) {
				if (a >= e) {
					c1x = c;
					c1y = d;
			        c2x = a;
			        c2y = b;
			        c3x = e;
			        c3y = f;
				}
				else {
					c1x = c;
					c1y = d;
			        c2x = e;
			        c2y = f;
			        c3x = a;
			        c3y = b;
				}
			}
			else if (e >= a && e >= c) {
				if (a >= c) {
					c1x = e;
					c1y = f;
			        c2x = a;
			        c2y = b;
			        c3x = c;
			        c3y = d;
				}
				else {
					c1x = e;
					c1y = f;
			        c2x = c;
			        c2y = d;
			        c3x = a;
			        c3y = b;
				}
			}
			int maxLimit;
			int minLimit;
	
			if (c1y >= c2y && c1y >= c3y)
				maxLimit = c1x;
		    else if (c2y >= c1y && c2y >= c3y)
		    	maxLimit = c2y;
			else
				maxLimit = c3y;
				
			if (c1y <= c2y && c1y <= c3y)
				minLimit = c1y;
	  	    else if (c2y <= c1y && c2y <= c3y)
		     	minLimit = c2y;
			else
				minLimit = c3y;
				
			System.out.println("");	
			
			// Here we create the graph with the triangle.
			for (y = 10 ; y >= -11 ; y-- ) {
				for (x = -10 ; x <= 11 ; x++) {
					if (y == 0) {
						if (((y-c1y)*(c1x-c2x) == (x-c1x)*(c1y-c2y) || (y-c2y)*(c2x-c3x) == (x-c2x)*(c2y-c3y) || (y-c3y)*(c3x-c1x) == (x-c3x)*(c3y-c1y)) && (x <= c1x && c3x <= x) && (minLimit <= y && y <= maxLimit))
							System.out.print("*");
						else if (x == 0)
							System.out.print("|");
						else if (x == 11)
							System.out.print("x");
						else 
							System.out.print("-");
					}
					else if (((y-c1y)*(c1x-c2x) == (x-c1x)*(c1y-c2y) || (y-c2y)*(c2x-c3x) == (x-c2x)*(c2y-c3y) || (y-c3y)*(c3x-c1x) == (x-c3x)*(c3y-c1y)) && (x <= c1x && c3x <= x) && (minLimit <= y && y <= maxLimit))
					    System.out.print("*");
					else if (x == 0) {
						if (y == 10)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else System.out.print(" ");
			     }
				System.out.println("");
			}
			System.out.println("");	
			System.out.println("");	
			
			break;
		case 3: // Here the user have chosen to create a rectangle in the coordinate system.
			System.out.println("For rectangle, we need the coordinates of the points for three vertices.");
			System.out.print("Please enter the coordinates of 3 vertices a, b, c, d, e, f:");
			
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();
			e = input.nextInt();
			f = input.nextInt();
			
			c1x = a;
			c1y = b;
			c2x = c;
			c2y = d;
			c3x = e;
			c3y = f;
			int c4x = c2x + c3x - c1x;
			int c4y = c2y + c3y - c1y;
			int temp = 0;
			int tempp = 0;
			
			if (c1x == c2x) {
				temp = c3x;
			    c3x = c2x;
			    c2x = temp;
			
			    tempp = c3y;
			    c3y = c2y;
			    c2y = tempp;
			}
			    
			// checking if it is a rectangle with the m1 * m2 = -1 formula
			if ((c1y-c2y)*(c1y-c3y) == -(c1x-c2x)*(c1x-c3x) && (c2y-c4y)*(c3y-c4y) == -(c2x-c4x)*(c3x-c4x) && (c3y-c4y)*(c3y-c1y) == -(c3x-c4x)*(c3x-c1x) && (c4y-c2y)*(c1y-c2y) == -(c4x-c2x)*(c1x-c2x)) {
			
			System.out.println("");	
			
			// Here we create the graph with the rectangle.
			for (y = 10 ; y >= -11 ; y-- ) {
				for (x = -10 ; x <= 11 ; x++) {
					if ((y == c1y || y == c3y) && (x <= c2x && x >= c1x))
						System.out.print("*");
					else if ((x == c1x || x == c2x) && (y <= c1y && y >= c3y))
						System.out.print("*");
					
					else if (y == 0) {
						if (x == 0)
							System.out.print("|");
						else if (x == 11)
							System.out.print("x");
						else 
							System.out.print("-");
					}
					else if (x == 0) {
						if (y == 10)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else System.out.print(" ");
				}
				System.out.println("");
			}
			}
			else
				System.out.println("The givin points won't create a rectangle!");
			
			System.out.println("");	
			System.out.println("");	
			
			break;
		case 4: // Here the user have chosen to create a parabola in the coordinate system.
			System.out.println("Parabola formula is y = ax^2 + bx + c");
			System.out.print("Please enter the coefficients a, b and c:");
			a = input.nextInt();
		    b = input.nextInt();
			c = input.nextInt();
			
			System.out.println("");	
			
			// Here we create the graph for the parabola.
			for (y = 10 ; y >= -10 ; y-- ) {
				for (x = -10 ; x <= 11 ; x++) {
					int value = a*x*x + b*x + c;
					if (y == 0) {
						if (value == 0)
							System.out.print("*");
						else if (x == 0)
							System.out.print("|");
						else if (x == 11)
							System.out.print("x");
						else 
							System.out.print("-");
					}
					else if (value == y){
						System.out.print("*");
					}
					else if (x == 0) {
						if (y == 10)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else System.out.print(" ");
				}
				System.out.println("");
			}
			System.out.println("");	
			System.out.println("");
			
			break;
		case 5: // Here the user have chosen to create a circle in the coordinate system.
			System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2");
			System.out.print("Please enter the coordinates of the center (a,b) and the radius:");
			 a = input.nextInt();
		     b = input.nextInt();
			int r = input.nextInt();
			
			System.out.println("");	
			
			// Here we create the graph for the circle.
			for (y = 10 ; y >= -10 ; y-- ) {
				for (x = -10 ; x <= 11 ; x++) {
					if (y >= b) {
					double value = Math.pow(r*r - (x-a)*(x-a), 0.5) + b; // this part is for the upper part of the circle
					if (y == 0) {
						if (value == 0)
							System.out.print("*");
						else if (x == 0)
							System.out.print("|");
						else if (x == 11)
							System.out.print("x");
						else 
							System.out.print("-");
					}
					else if (value == y){
						System.out.print("*");
					}
					else if (x == 0) {
						if (y == 10)
							System.out.print("y");
						else
							System.out.print("|");
					}
					else System.out.print(" ");
				}
				else {
					double value = -(Math.pow(r*r - (x-a)*(x-a), 0.5)) + b; // this part is for the lower part of the circle
				if (y == 0) {
					if (value == 0)
						System.out.print("*");
					else if (x == 0)
						System.out.print("|");
					else if (x == 11)
						System.out.print("x");
					else 
						System.out.print("-");
				}
				else if (value == y){
					System.out.print("*");
				}
				else if (x == 0) {
					if (y == 10)
						System.out.print("y");
					else
						System.out.print("|");
				}
				else System.out.print(" ");
			}
				}
				System.out.println("");
			}
			System.out.println("");	
			System.out.println("");
			
			break;
		case 6:
			break;
		}
		}
		input.close();
	}
}	


