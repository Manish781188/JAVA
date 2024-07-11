/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class check_equalsIgnore_case
{
 static boolean equals(String str1,String str2){
     
     if(str1.length()!=str2.length()){
         return false;
     }
     String str3=str1.toLowerCase();
     String str4=str2.toLowerCase();
     for(int i=0;i<str3.length();i++){
         if(str3.charAt(i)!=str4.charAt(i)){
             return false;
         }
     }
     return true;
 }

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first String");
	String str1 = sc.nextLine();
	System.out.println("Enter the second String");
	String str2 = sc.nextLine();
	if(equals(str1,str2)){
	    System.out.println("Strings are equals");
	}
	else{
	    System.out.println("Strings are not equals");
	}
	}
}
