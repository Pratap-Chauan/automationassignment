package StringDemo;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string\n");
		
		String ss = input.nextLine();
		
		//String ss = "123";
		StringBuffer sbr = new StringBuffer(ss);
		sbr.reverse();
		System.out.println(sbr);
	
		
	}
	
	

}
