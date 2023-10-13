package automationassignment;

import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	
	{
	
	try (Scanner no = new Scanner(System.in)) {
		System.out.println("Enter no to get the reverese no output");
		int reverse = 0;	
		int number = no.nextInt();
		
		while(number!=0)
		{
			int reminder = number%10;
			reverse = reverse*10 + reminder;
			number = number/10;
			
		}	

		System.out.println("Reverse no is " + reverse);
	}
	}

}
