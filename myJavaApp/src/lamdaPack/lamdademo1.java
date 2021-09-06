package lamdaPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
public class lamdademo1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List <String> l1=new ArrayList<String>();
 l1.add("A");
 l1.add("B");
 l1.add("D");
 l1.add("A");
 l1.add("K");

 l1.forEach(i -> System.out.print(i + "\t"));
 System.out.println();
 System.out.println("*********************************************************************");
		
 long count = Stream.of("A","B","C","A","A","D")
		 		.count();
 System.out.println("The count is:" + count);
 
 count = LongStream.of(3,5,1,5,7,5,7,8,5)
			.filter(i -> i == 3)
		 	.count();
 System.out.println("the number 3 comes  " + count + " times" );
 
 List<String> words = Arrays.asList("Butter","Array","Kite","flight","Aeroplane","match");
 
 List <String> ans= words.stream().filter(i->i.length() > 5) 
		 			.collect(Collectors.toList());
 
 ans.forEach(i->System.out.println(i));
 
}
}