
import java.util.HashSet;
public class sets {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		int[] arr = {2,4,3,1,2,7,4};
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		for(Object i : hs.toArray()) {
		System.out.print(i + " ");
	}
}
}
