package automationassignment;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int squre_num;
		int cube_num;
		int fourth_num;
		
		System.out.println("Please provide the input");
		num = input.nextInt();
		
		squre_num = num * num;
		cube_num = squre_num * num;
		fourth_num = cube_num *num;
		System.out.println("Squre of "+ num + " is: " + squre_num);
		System.out.println("cube of "+ num + " is: " + cube_num);
		System.out.println("fourth of "+ num + " is: " + fourth_num);
	}

}
