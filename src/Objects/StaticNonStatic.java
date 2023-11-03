package Objects;




public class StaticNonStatic {
	public static void main(String[] args)
	{
		int n1=5;
		int n2=6;
		calculator3 addi =new calculator3();
		int result = addi.add(n1, n2);
		System.out.println(result);
		int result1 = calculator3.minus(n2, 1);
		System.out.println(result1);
	}

}

class calculator4
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
