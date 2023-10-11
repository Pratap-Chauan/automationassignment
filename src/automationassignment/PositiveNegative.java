package automationassignment;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args)
	
	{
	
		try (Scanner in = new Scanner(System.in))
		
		{
			System.out.println("Enter No");
			int input = in.nextInt();
			
			if(input>0)
			{
			
				System.out.println("Numer is posotive");
				
			}
			
			else if (input<0)
			
			{
				System.out.println("Numer is Negetive");
			}
			
			else
			
			{
				System.out.println("Numer is Zero");
				
			}
		}
	}

}
