package automationassignment;

import java.util.Scanner;

public class Weekday

{
	
	public static void main(String[] args) 
	
	{
		try (Scanner mn = new Scanner(System.in))
		{
			int weekday;
			String day = "";
			
			System.out.println("Enter week day no");
			weekday = mn.nextInt();
			
			switch (weekday) 
			{
			
			case 1:
				  day = "Monday";
				  System.out.println(day);
				  
				  break;
			case 2:
				  day = "Tuesday";
				  System.out.println(day);
				  break;
			case 3:
				  day = "Wednesday";
				  System.out.println(day);
				  break;
			case 4:
				  day = "Thursday"; 
				  
				  System.out.println(day);
				  break;
			case 5:
				  day = "Friday"; 
				  System.out.println(day);
				  break;
			case 6:
				  day = "Saturday"; 
				  System.out.println(day);
				  break;
			case 7:
				  day = "Sundday";
				  System.out.println(day);
				  break;

			default:day = "Invalid day range";
			System.out.println(day);
			  break;				
			
			}
			
			//public static int parseInt(String s)  
			//int i=Integer.parseInt("200");  
			
		//	int i=Integer.parseInt(day);
			//
		//	if (i !=0)
			//	System.out.printf("Number of days in %d Weekday is: %d\n", weekday, i);
		//	else
			//	System.out.printf("you have entered invalid no");
		}
		
		
	}

}
