package automationassignment;



public class AllClass2 
{
	public static void main(String[] args) {
		
		IndHuman1 h1 =  new IndHuman1();
		h1.speak("Hi");
		
	}

}



class IndHuman1 {

String name= "pratap";
int age;
double height;
double weght;
static String country;
public void speak (String content)
{
	System.out.println(name+ "-" + content);
}

}




