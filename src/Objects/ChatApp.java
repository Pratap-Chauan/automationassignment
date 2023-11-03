package Objects;

public class ChatApp

{
	public static void main(String[] args)
	{
		
Human h1 = new Human();	

h1.name = "Pratap";	
h1.age = 25;
h1.country = "Bharat";

Human h2 = new Human();	

h2.name = "Jay";	
h2.age = 25;


h1.speak("Hello");
h2.speak("Hi");
h1.shoinfo();	
	
}
	}	
	
	


class Human
{
	String name;
	int age;
	static String country="India";
	
	
	public void speak(String content)
	{
		System.out.println(name + ":" + content);
		
	}
	
	public void shoinfo()
	{
		System.out.println("Name" +name+ ",age is" + age);
		
	}
	

}



