package Objects;


public class Classdemo {
	public static void main(String[] args)
	{
		int n1=5;
		int n2=6;
		calculator2 addi =new calculator2();
		int result = addi.add(n1, n2);
		System.out.println(result);
		int result1 = calculator2.minus(n2, 1);
		System.out.println(result1);
	}

}

class calculator2
{
	public int add(int i, int j)
	{
		int r = i+j;
		
		return r;
	}
	
	public static int minus(int o, int p)
	{
		int g = o-p;
		
		return g;
	}
	
}