package demoPkg;

public class QA2 implements QA1I
{

	int a = 20;
	
	public void printvar()
	{
		final int a = 40;
		//a=50;
		System.out.println(a);  //40
		System.out.println(this.a);  //20
		//System.out.println(super.a); //100
		
		//super.sum(20, 30);
	}
	
	public void sum1(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a & b: " + c);
	}
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a & b: " + c);
	}
	
	
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		q2.sub(20, 30);
		//q2.sum(20, 30);
		q2.printvar();
		
		
	}

	
	public void QA1IM() {
		System.out.println("this is QA1I interface method");
		
	}

}
