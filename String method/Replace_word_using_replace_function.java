
import java.util.Scanner;
public class Replace_word_using_replace_function
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		System.out.println("Enetr the string you want to replace");
		 String str1 = sc.nextLine();
		 System.out.println("Enter the string  you want to placed in the place of replace word ");
		 String str2 = sc.nextLine();
		 System.out.println(str.replace(str1, str2));
	}
}