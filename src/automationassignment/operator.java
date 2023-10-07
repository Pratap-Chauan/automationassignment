package automationassignment;

import java.util.Scanner;

public class operator {
	public static void main(String[] args) {
	//	int i = 10;
		//int j = i++ + i++ + --i + ++i + ++i; 
	
		//System.out.println("value of J="  + j);
		//System.out.println("Value of i=" + i); 

		Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();
        
        System.out.printf("Sum of Two No is %d%n", firstInt + secondInt);
        System.out.printf("Difference  of Two No is %d%n", firstInt - secondInt);
        System.out.printf("Product  of Two No is %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt ));
        System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
	}

}
