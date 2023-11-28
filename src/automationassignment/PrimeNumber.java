package automationassignment;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to check whether it is prime or not\n");
		int i = input.nextInt();
		
		//int i = 23;
		boolean isprime = true;
		
		if(i%2==0)
			{
			isprime= false;
			}
		else
		{
			for(int j=3; j<i; j=j+2)
			{
				if(i%j ==0)
				{
					isprime=false;
					break;
					
				}
				
			}
			
			
		}
		
		if(isprime)
		{
			System.out.println(i + " prime Number");
		}
		else
		{
			System.out.println(i + " is not prime Number");
			
		}
		
	}

}
