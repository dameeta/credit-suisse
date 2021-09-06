package myJavaApp;


class B{
	int b1x;
	public void Bmethod()
	{
		System.out.println("Hello B method");
	}
}


public class myClass {

	
	public void myclassMethod()
	{
		
		D d1=new D();
		d1.Dmethod();
		System.out.println("Inside myClass method");
	}
	 class D{
	          class E{
	    	     public  void Emethod()
	    	          { 
	    	           	B b1=new B();
	    		        b1.b1x=45;
	    		        b1.Bmethod();
	    		        System.out.println("Inside Emethod" + b1.b1x);
	    	         }
	                 }
	       public void Dmethod()
	       	{
	       		E e=new E();
	       		e.Emethod();
	       		System.out.println("Inside D method");
		   		}
	 				}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 myClass mc1=new myClass();
 mc1.myclassMethod();
 
	}

}
