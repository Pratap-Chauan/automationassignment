package StringDemo;

public class StringComparisonExample {
	public static void main(String[] args) {
		
	String str  = "Test";
	String str1 = "Test";
	
	String str3 = new String ("Test");
	
	System.out.println(str==str1);
	System.out.println(str1==str3);
	
	System.out.println(str.equals(str3));
	System.out.println(str.equals(str1));	
	}

}
