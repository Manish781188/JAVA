import java.util.Scanner;
public class Email_verification{
    static boolean check_Email(String email){
        String word[] = email.split("@");
        char ch[] = word[0].toCharArray();
        
         for(char c : ch ){
            if(c>='a' &&  c<='z'  || c>=0 && c<=9 || c=='.'){
                return true;
            }
        }
           return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email ");
        String email = sc.nextLine();

  System.out.println(check_Email(email));
    }
}