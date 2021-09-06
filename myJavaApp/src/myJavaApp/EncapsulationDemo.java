package myJavaApp;

class Acc{
	public double getBalanace() {
		return balanace;
	}

	public void setBalanace(double balanace) {
		this.balanace = balanace;
	}

	private double balanace;
	int accno;
	
	public void myAcc()
	{
		
		System.out.println(balanace);
	}
}



public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Acc ac1=new Acc();
//ac1.balanace=9000;
ac1.accno=890;
	}

}
