package demoPkg;

public class CallMyINterface implements MyInterface
{


	public void meth2() 
	{
		System.out.println("this is interface method2");
		
	}

	
	public void meth3() 
	{
		System.out.println("this is interface method3");
		
	}

	public static void main(String[] args) {
		CallMyINterface mpi = new CallMyINterface();
		mpi.meth2();
		mpi.meth3();
	}
	
	
}
