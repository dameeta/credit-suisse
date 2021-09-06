package myJavaApp;



public class StaticDemo {

	int x;
	static int y;
	public StaticDemo()
	{
		System.out.println(x++);
		System.out.println(y++);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo sd1=new StaticDemo();
		StaticDemo sd2=new StaticDemo();
		
		
	}

}
