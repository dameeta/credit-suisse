package mycollections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size=8;
			
		Vector<Integer>  v1= new Vector<>(size);
		
		for(int x=1;x<=size;x++)
		{
			
			v1.add(x);
		}
		
		System.out.println(v1);
		v1.remove(4);
		System.out.println(v1);
		System.out.println(v1.get(3));
		
	}

}
