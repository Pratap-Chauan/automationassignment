package automationassignment;

import java.util.Scanner;

public class Temperature {
	
	 public static void main(String[] args) 
	    {  
		 
		 try (Scanner in = new Scanner(System.in)) {
			System.out.println("input celsius:");
			double celsius = in.nextDouble();
			
	        // initialising 
	       double  fahrenheit = 0.0, kelvin = 0.0 ; 
	        
	        // formula for conversion 
	        //°F = 1.8°C + 32°
	        fahrenheit = (celsius * 1.8) + 32; 
	        
	        System.out.println( 
	           " value of temperature in fahrenheit:"
	           + fahrenheit); 
	        
	      //°C + 273°
		        kelvin = (celsius) +273;
		
			System.out.println( 
	            " value of temperature in kelvin:"
	          + kelvin); 
		 }
	    } 

}
