package automationassignment;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	  {
		try (Scanner in = new Scanner (System.in)) {
			System.out.println("Enter no to get the Fibonacci Series ");
			int n= in.nextInt();
			 
			int i = 0, firstno = 0, secondno = 1;
			
			while(i<=n)
			{
				System.out.print(firstno + ", ");

			      int nextTerm = firstno + secondno;
			      firstno = secondno;
			      secondno = nextTerm;

			      i++;
			}
		}
		
	   
	    }
  }


