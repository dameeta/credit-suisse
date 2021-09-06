package myJavaApp;
interface Father{
	public void fathername();
	
}
interface Mother{
	
	public void mothername();
}

class kid implements Father,Mother{

	@Override
	public void mothername() {
		// TODO Auto-generated method stub
		System.out.print("Savita" + " ");
	}

	@Override
	public void fathername() {
		// TODO Auto-generated method stub
		System.out.print("Suresh" + " ");
	}
	
	public void kidname()
	{
		String surname="Shah";
		System.out.print("Sujoy" + " ");
		fathername();
		mothername();
		System.out.print(surname);
	}
	
}

public class multipleInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kid k1=new kid();
k1.kidname();

		
	}

}
