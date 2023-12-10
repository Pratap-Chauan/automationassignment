package StringDemo;

import java.util.Scanner;

public class CapitalizeFirstWord {
	public static void main(String[] args)

	{	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String message = input.nextLine();
		  
		    char[] charArray = message.toCharArray();
		    boolean foundSpace = true;

		    for(int i = 0; i < charArray.length; i++) {

		  
		      if(Character.isLetter(charArray[i])) {

		  
		        if(foundSpace) {

		  
		          charArray[i] = Character.toUpperCase(charArray[i]);
		          foundSpace = false;
		        }
		      }

		      else {
		  
		        foundSpace = true;
		      }
		    }

		  
		    message = String.valueOf(charArray);
		    System.out.println("Message: " + message);
		  }

	}


