

public class constandString
{
	public static void main(String[] args) {
	String  s1="Java";
		String  s2="Java";
  /////print the address
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
}
}

