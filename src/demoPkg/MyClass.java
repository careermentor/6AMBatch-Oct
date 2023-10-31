package demoPkg;

public class MyClass 
{
	int a=10;
	float b = 10.5f;
	char c = 'X';
	String name="Java";
	boolean d = true;

	public void printvar()
	{
		a=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		MyClass abc = new MyClass();  //object of the class
		//System.out.println(abc.a);
		abc.printvar();
		
		System.out.println(abc.a);
		
	}
	
	

}