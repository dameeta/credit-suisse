package myJavaApp;

import java.util.Scanner;

public class stReportArray {

	public void ReportMethod()
	{
		int id[]= {};
		String stname[]= {};
		double engmarks[]= {};
		double mathsmarks[]= {};
		double scimarks[]= {};
		double ssmarks[]= {};
		System.out.println("How many students data you want to enter");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		System.out.println("Enter id ");
        System.out.println("Enter names");
        System.out.println("Enter eng,naths ,sci,ss marks");
		for(int i=0;i<limit;i++)
		{
			id[i]=sc.nextInt();
			stname[i]=sc.next();
			engmarks[i]=sc.nextInt();
			mathsmarks[i]=sc.nextInt();
			scimarks[i]=sc.nextInt();
			ssmarks[i]=sc.nextInt();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
