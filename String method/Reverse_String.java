/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Reverse_String
{
    static String ReverseString(String str){
       String rstr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            rstr=ch+rstr;
            
        }
        return rstr;
    }
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a String");
     String str = sc.nextLine();
     System.out.println("Reversestring is =" +ReverseString(str));
}
}
