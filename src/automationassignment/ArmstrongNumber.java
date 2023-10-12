package automationassignment;
import java.util.Scanner;


public class ArmstrongNumber 
{
	public static void main(String[] args)
    {
        int originalNum, digit, cubeSum = 0,num;
        
        System.out.println("Enter the number:");
        try (Scanner sc = new Scanner(System. in )) {
			num = sc.nextInt();
		}
        originalNum = num;
        while (num!= 0)
        {
            digit = num % 10;
            //System.out.println("value of digit"+digit);
            
            cubeSum += Math.pow(digit, 3);
                        
            //System.out.println("value of cubeSum"+cubeSum);
            
            num /= 10;
            //System.out.println("value of num"+num);
        }
        if(cubeSum == originalNum)
            System.out.println(originalNum+ " is an Armstrong number");
        else
            System.out.println(originalNum+ " is not an Armstrong number");
    

}
}

