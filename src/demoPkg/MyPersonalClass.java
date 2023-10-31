package demoPkg;

public class MyPersonalClass extends MyAbsClass
{

	
	public void credential() 
	{
	
		System.out.println("this is my credential");
		
	}

	public static void main(String[] args) {
		MyPersonalClass mp = new MyPersonalClass();
		mp.meth1();
		mp.credential();
	}
	
	
}
