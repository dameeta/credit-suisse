package exceptionDemos;

public class Exception1 {

	
	public int divide(int x,int y)
	{
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exception1 e1=new Exception1();
		try {
		System.out.println(e1.divide(2, 0));
		}
		catch(Exception ae)
		{
			
			System.out.println("divisor should not be zero " + ae) ;
		}
		
		
		finally {
			
			System.out.println("this will always execute");
		}
	}

}
