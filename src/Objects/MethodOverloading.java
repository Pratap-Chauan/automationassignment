package Objects;

public class MethodOverloading
{ public static void main(String[] args) {



	int k1 = 10;
	int k2=4;
	/*
	 * int k = calculator1.add(k2, k1); System.out.println(k);
	 */
	double k = calculator1.add(k1/k2,5);
	System.out.println(k);

}

}


class calculator1
{

	static int add (int i, int j)
	{
		return i+j;

	}

	static double add (double m, int j)
	{
		return m+j;

	}


}