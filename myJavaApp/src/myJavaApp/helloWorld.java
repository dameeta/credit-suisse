package myJavaApp;

import java.util.Scanner;

public class helloWorld {
	
	public void display(double r)
	
	{
		System.out.println("Area of circile is:" + 3.14*r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        helloWorld hw=new helloWorld();
		System.out.println("Hello!!Happy learning java.");
		Scanner sc=new Scanner(System.in);	
	
		double r=sc.nextDouble();
		hw.display(r);
		
	}

}
