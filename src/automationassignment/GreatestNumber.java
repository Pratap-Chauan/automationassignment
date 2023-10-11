package automationassignment;

import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args)

{
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter First No:");
	int num1 = in.nextInt();
	
	System.out.println("Enter Second No");
	int num2 = in.nextInt();
	
	System.out.println("Enter Third No");
	int num3 = in.nextInt();
	
	if(num1>num2)
		if(num1>num3)
			System.out.println(num1 + "is greates no");
	
	if(num2>num1)
		if(num2>num3)
			System.out.println(num2 + "is greatest no");
	
	if(num3>num1)
		if(num3>num2)
			System.out.println(num3  + "is greates no");
}
}
