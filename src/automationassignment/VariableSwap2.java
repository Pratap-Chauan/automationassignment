               package automationassignment;

import org.testng.annotations.Test;

public class VariableSwap2 {
	@Test	
	public void main()

	{


		int i = 10;
		int j = 7;

		i=i+j;
		j=i-j;
		i=i-j;

		System.out.println("value of i is " +i);



		System.out.println("value of j is "+ j);



	}

}
