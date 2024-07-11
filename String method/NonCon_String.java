

public class NonCon_String
{
	public static void main(String[] args) {
	String  s1=new String("Java");

		String  s2=new String("Java");
     ///print the address
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
}
}

