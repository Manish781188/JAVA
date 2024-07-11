
import java.util.Scanner;
public class lower_upper_without_function
{
    static String upper(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                int ascii = (int)(str.charAt(i));
                int newascii =ascii-32;
                char ch = (char)(newascii);
              newstr = newstr+ch;
            }
            else{
                newstr =  newstr+str.charAt(i);
            }
        }
        return newstr;
    }
 
 

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first String");
	String str = sc.nextLine();
	System.out.println(upper(str));
}
}
