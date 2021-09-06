package myJavaApp;

class Employee{
	
	public void empBehaviours(String role)
	{
		//role="Father";
		
		System.out.println("Role is:" + role);
	}
	public void empBehaviours(String role,int hrs)

	{
		//role ="Manager";
		System.out.println("Role is :" + role + "for" + hrs +"hrs");
		
	}

	public void empBehaviours(String role,String activity)
	{
		
		//role="Gym Member";
		//activity="Exercise";
		System.out.println("Role is:"+ role + "is doing :" + activity );
	}

}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employee e1=new Employee();
 e1.empBehaviours("Father");
 e1.empBehaviours("Manager", 9);
 e1.empBehaviours("Gym Member", "Exercise");
	}

}
