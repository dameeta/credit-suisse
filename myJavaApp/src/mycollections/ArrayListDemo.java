package mycollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> l1=new ArrayList<Integer>();
		l1.add(3);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(67);
		System.out.println(l1);
		l1.add(5,101);
		System.out.println(l1);
		List <Student> l2=new ArrayList<Student>(); 

Student s1=new Student(101,"Twisha","Php");
Student s2=new Student(102,"Nikhil","Java");
Student s3=new Student(103,"Pratik","AWS");
Student s4=new Student(104,"Alisha","Python");


l2.add(s1);
l2.add(s2);
l2.add(s3);
l2.add(s4);
System.out.println(l2);
l1.remove(3);
System.out.println(l1);
l2.add(2, new Student(33,"Raksha","Cpp"));
System.out.println(l2);


	System.out.println(l2.get(3));
	}

}
