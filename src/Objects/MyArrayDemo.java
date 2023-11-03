package Objects;

public class MyArrayDemo {

	public static void main(String[] args) {

		
		/*
		 * int ar[] = new int[10]; ar[0]= 10; ar[1]= 12; System.out.println(ar[0] +
		 * ar[1]);
		 */
		
		 // int ar[] = new int[10];

		/*
		 * int ar[] = new int[-10]; ar[0]= -8; ar[1]= 12;
		 */

		/*
		 * int ar[] = {10,20,30,40}; System.out.println(ar[0]);
		 * System.out.println(ar[3]);
		 */

		/*
		 * int ar[] = new int[]{10,20,30}; System.out.println(ar[0]);
		 */

		int [][] Studentdat = {
				
				
				{40,50,30,40},
				{80,90,40,50}
		};
		
		
		System.out.print(Studentdat[0][2]);
		System.out.println(Studentdat[0][3]);
		
		System.out.println(Studentdat[1][0]);
	}

}
