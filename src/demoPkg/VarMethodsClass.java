package demoPkg;

public class VarMethodsClass 
{
	
	int a = 30;  //global variable
	
	public void printvar()
	{
		final int a = 40;  //local variable  // constant
		//a=50;
		
		System.out.println(a);  //40//50
		System.out.println("this is variable value which is number: " + a);
		System.out.println(10+20);  //30
		System.out.println("10" + "20");
	}
	
	
	public void printanothervar()
	{
		a=60;
		System.out.println(a); //30
	}

	

}
