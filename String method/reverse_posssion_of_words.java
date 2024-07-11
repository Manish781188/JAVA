/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class reverse_posssion_of_words
{
      static String R_possion_of_words(String str){
        String arr[] =str.split(" ") ;
        String rstr=" ";
        for(int i=arr.length-1; i>=0;i--){
            
            rstr+=arr[i] +" ";
        }
        return rstr;
    }
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ente a string ");
	String str = sc.nextLine();


	//Main st = new Main();
	System.out.println(R_possion_of_words(str));
		
	}
}
