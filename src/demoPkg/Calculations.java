package demoPkg;

public class Calculations 
{
	public float sum()  //no arguments/parameter/input
	{
		int a = 30;
		float b = 40.5f;
		float c = a+b;
		
		System.out.println("sum of a & b: " + c);
		return c;
	}
	
	public int add(int a, int b) //with arguments/parameter/input
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
		
		//20+30+40
		//x = 20+30
		//x+40
	
		
		
	}
	
	public Calculations()
	{
		System.out.println("this is simple constructor");
	}
	
	public Calculations(int i, int j)
	{
		
		int k = i+j;
		System.out.println(k);
		
		System.out.println("this is method has a constructor");
		
		
	}
	
	public static void main(String[] args) 
	{
		Calculations cal1 = new Calculations();
		
		
		Calculations cal = new Calculations(40,70);  //constructor will be called automatically
		
		cal1.sum();
		
		cal.add(10, 20);
		cal.add(50, 60);
		int x = cal.add(20, 30);
		cal.add(x, 40);
		
	}
	
}
