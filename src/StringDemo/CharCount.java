package StringDemo;

import java.util.Scanner;

public class CharCount {
	public static void main(String[] args) {
		
		
		 try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the String");
			 String str = input.nextLine();
			 
			
			//String str = "this is java";
			int count = 0;
			
			for(int i=0; i<str.length();i++)
			{
				if(str.charAt(i)!=' ')
					count++;
						
				
			}
			
			System.out.println("Character count in String are "+count);
		} 
		
	}

}
