package automationassignment;

import java.util.Scanner;

public class hour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input seonds:");
		int seconds = in.nextInt();
		int S = seconds%60;
		int H = seconds/60;
		int M = H%60;
		H = H/60;
		System.out.println(H+":"+M+":"+S);
		
		
				
	}

}
