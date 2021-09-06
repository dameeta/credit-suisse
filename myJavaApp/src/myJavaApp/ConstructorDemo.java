package myJavaApp;

class Parent{
	int x=10;
	int y;
	public Parent()
	{
		System.out.println("Default Parent");
	}
	public Parent(int x)
	{
		this.x=x;
		System.out.println("x is:" +x);
	}
	public Parent(int x1,int y)
	{
		
		this(x1);
		this.x=x1;
		System.out.println("x1 is:" + x1);
	}
}
class Childe extends Parent{
	public Childe()
	{
		super();
		System.out.println("Default Childe");
		
	}
	public Childe(int g1)
	{
		super(g1);
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childe ch2=new Childe();
		Parent p1=new Parent(11);
		Parent p2=new Parent(13,14);
		Childe ch3=new Childe(67);
	}

}
