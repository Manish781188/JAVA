/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class upper_lower_without_using_function
{
    static String lower(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)>= 'A' && str.charAt(i) <= 'Z'){
            int ascii = (int)(str.charAt(i));
            int newascii =ascii+32;
            char ch = (char)(newascii);
            newstr = newstr+ch;
        }
        else{
            newstr = newstr+str.charAt(i);
        }
        }
        return newstr;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the String");
		String str = sc.nextLine();
		System.out.println(lower(str));
	}
}
