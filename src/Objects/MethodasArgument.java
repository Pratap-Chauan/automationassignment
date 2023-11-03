package Objects;

public class MethodasArgument {
	
		  public static void main(String[]  args)
		  
		  {

		    Aa a1 = new Aa();

		    int output =   a1.add(a1.add(10,20),a1.add(30,40));
		    
		    System.out.println(output);

		  }
}


		
		class Aa{

			  public int add(int i , int j)
			  {

			    return i+j;

			  }

			}



