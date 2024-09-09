
import java.util.*;
public class Hashmap {

	
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3,30);
		// hm.put(1,40);
		hm.replace(1,50);
		hm.remove(2);
		System.out.println(hm.containsKey(1));
		System.out.println(hm);
		System.out.println(hm.get(1));
	}
}
