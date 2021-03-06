package mycollections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Creating a TreeSet
        SortedSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);

       // SortedSet<String> fruit = new TreeSet<>(Comparator.reverseOrder());
   
//The above TreeSet with the custom Comparator is the concise form of the following:
            SortedSet<String> fruit = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s2.compareTo(s1);
                }            });       

     // Adding new elements to a TreeSet
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("Pineapple");
        fruit.add("Orange");

        System.out.println("Fruits Set : " + fruit);

		
	}

}
