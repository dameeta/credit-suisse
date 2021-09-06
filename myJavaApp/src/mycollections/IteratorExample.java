package mycollections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {

		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(333);
		al.add(38);
		al.add(353);
		al.add(34);
		al.add(76);
		al.add(23);
		//al.add(null);
		System.out.println(al);		

		Iterator<Integer>itr = al.iterator();
		
		while(itr.hasNext())
		{
		  Integer x=itr.next();
		  if(x<=30)
		  {
			  itr.remove();
		  }
		}
			System.out.println(al);
		
		
	
	}	
		
		
	}


