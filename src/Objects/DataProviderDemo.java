package Objects;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	// TestNG - 90% 

	@DataProvider(name="addvalue")
	public static Object[][] data1() 
	{
		Object[][] h1 = 
			{
					{10,20,30},
					{20,50,70},
					{4,2,7},
					{6,7,13}
			};
		return h1;
	}

	@Test(dataProvider = "addvalue")
	void add(int i, int j, int expected)
	{
		//Assert.assertEquals(i+j, expected);

		if(i+j == expected) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
