/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class lower_to_upper_ignoring_special_ch_without_function
{
    static String lower(String str){
        String newstr = "";
      for(int i=0;i<str.length();i++){
          int ascii = (int)(str.charAt(i));
          if(ascii>=97 && ascii<=122){
              int newascii = ascii-32;
              char ch = (char)(newascii);
              newstr = newstr+ch;
          }
          else{
              if(ascii>=65 && ascii<=97){
                  char ch = (char)(ascii);
                  newstr = newstr+ch;
              }
          }
      }
      return newstr;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println(lower(str));
	}
}
