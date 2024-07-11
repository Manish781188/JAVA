
import java.util.*;
public class Example_of_ArrayList
{
	public static void main(String[] args) {
	    ArrayList<Integer> al = new ArrayList<>();
	    al.add(54);
	    al.add(43);
	    al.add(53);
	    Iterator<Integer> itr = al.iterator();
	    while(itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("ssize of array list " +al.size());
	for(int i=0;i<al.size();i++){
	    System.out.println(al.get(i));
	}
}
}
