package demoPkg;

public abstract  class MyAbsClass    //concrete  //abstract
{
	int a = 30;
	

	public void meth1()     //concrete
	{
		a=50;
		a=60;
		System.out.println("this is simeple method");
	}
	
	
	public abstract void credential();  //abstract
	
	
	
	
}
