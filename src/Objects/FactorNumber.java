package Objects;

import java.util.Scanner;

public class FactorNumber
{
public static void main(String[] args) {
	
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("\nEnter the number");
	num = sc.nextInt();
	int i, count = 0;
	System.out.println("\nThe factors of  " + num + " are ");
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count = count + 1;
			System.out.print(i + " ");
		}	
				
	}
	
	
	System.out.println("\n Total factor of" + num + ":" +count);
	
}
}
