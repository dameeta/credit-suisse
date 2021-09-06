package myJavaApp;

class Base{ 
	int x=9, y=1;
	
}

class child extends Base{
	
	public void childmethod()
	{
		System.out.println(x+y);
	}
}

public class singleInheriDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child ch1=new child();
		ch1.childmethod();
	}

}
