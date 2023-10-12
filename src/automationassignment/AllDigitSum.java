package automationassignment;

import java.util.Scanner;

public class AllDigitSum {
	public static void main(String[] args) {
	
		int originalNum, digit, Sum = 0,num;
		
	try (Scanner in = new Scanner(System.in)) {
		System.out.println("Enter no to get the sum");
		num = in.nextInt();
	}
	originalNum = num;
	while(num!=0)
	{digit=num%10;
	Sum+=digit;
	num/=10;
	//System.out.println("Sum of"+originalNum+ "is"+ Sum);
	}
	
	System.out.printf("Sum of"+  originalNum + "is" +Sum);
	

	
		
	}

}
