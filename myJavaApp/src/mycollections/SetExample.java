package mycollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer>s1=new HashSet<>();
		
		s1.add(3);
		s1.add(null);
		s1.add(null);
		s1.add(66);
		s1.add(3);
		s1.add(1);
		s1.add(2);
		System.out.println(s1);

		TreeSet<Integer> lh1=new TreeSet <Integer>();
		lh1.add(886);
		lh1.add(23);
		lh1.add(102);
		lh1.add(309);
		lh1.add(3);
		lh1.add(23);
		
		System.out.println(lh1);
		System.out.println(lh1.hashCode());
		lh1.remove(102);
		System.out.println(lh1);
	
	List <Double> data1=new ArrayList<>();
	data1.add(1.3);
	data1.add(1.2);
	data1.add(2.3);
	data1.add(2.3);
	
	List <Double> data2=new ArrayList<>();
	data1.add(4.3);
	data1.add(3.2);
	data1.add(2.3);
	data1.add(6.3);
	
	Set<Double> mainset=new HashSet<Double>(data1);
	mainset.addAll(data2);
	System.out.println(mainset);
	Set <Student> s3=new HashSet<Student>();
	s3.add(new Student(8,"hina","Php"));
	s3.add(new Student(2,"Tina","Scala"));
	s3.add(new Student(1,"Hina","Kotlin"));
	s3.add(new Student(7,"hina","Java"));
	s3.add(new Student(8,"hina","Php"));

	System.out.println(s3);
	
	
	}

}
