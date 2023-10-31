package demoPkg;

public class QA1 
{

	static int i = 100;
	
	public void sum(int a, int b)
	{
		System.out.println(i);
		
		int c = a+b;
		System.out.println("sum of a & b: " + c);
	}
	

	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		//q1.sum(10, 20.5f);
		///q1.sum(10, 20, 30);
		
		//QA1.sum(50,100);
		
		System.out.println("this is my main method");
		
	}

}
