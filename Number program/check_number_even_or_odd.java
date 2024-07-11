
import java.util.Scanner;

  class check_number_even_or_odd{

   static boolean Even(int n){
      
       if(n%2==0){
      return true;
       }

       return false;
          }
    static boolean Odd(int n){
      
       if(n%2!=0){
           return true;
       }

       return false;
          }
    public static void main(String[] args){

   Scanner sc= new Scanner(System.in);
    System.out.println("Enter teh value of n:");
      int n=sc.nextInt();
       even(n);
  }
}