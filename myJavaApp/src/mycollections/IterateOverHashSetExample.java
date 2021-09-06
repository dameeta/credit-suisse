package mycollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSetExample {
    public static void main(String[] args) {
        Set<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Ruby");
        

        System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");
        programmingLanguages.forEach(i -> {
            System.out.println(i);
        });
        System.out.println("=== Iterate over a HashSet using iterator() ===");
        Iterator<String> s1 = programmingLanguages.iterator();
        while (s1.hasNext()) {
            String programmingLanguage = s1.next();
            System.out.println(programmingLanguage);
        }
        System.out.println("=== Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method ===");
        s1 = programmingLanguages.iterator();
        s1.forEachRemaining(f1 -> {
            System.out.println(f1);
        });

        System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
        for(String programmingLanguage: programmingLanguages) {
            System.out.println(programmingLanguage);
        
        Student s3=new Student(1,"abc","xyz");
        Student s2=new Student(1,"abc","xyz");
        
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
        s3=s2;
        System.out.println(s3.hashCode());
        System.out.println(s2.hashCode());
        
       // write the diff between comparable/comparator interface 
        
        }
    }
}