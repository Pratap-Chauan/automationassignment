package Objects;

public class Method {

public static void main(String[] args) {
	
	
	int i =10;
	int j =20;
	int m = Calc.add(i,j);
	int n = Calc.div(i,j);
	int o = Calc.mul(i,j);
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);
}

}


class Calc

{
	
	
static int add(int input1, int input2)
{
int output = input1 +input2;
	return output;
}
	
static int div(int input1, int input2)
{
int output = input2/input1;
	return output;
}

static int mul(int input1, int input2)
{
int output = input1 *input2;
	return output;
}


	
}
