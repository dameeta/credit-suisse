package mycollections;

import java.util.HashMap;
import java.util.Map;
//Map.Entry interface
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(3, "jkl");
		map.put(4, "efg");
		map.put(5, "lmn");
		map.put(6, "lmn");

	
	for(Map.Entry mv : map.entrySet()) {
		
		System.out.println(mv.getKey() +" " + mv.getValue());
	}
	
	
	}
	
	

}
