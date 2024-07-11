
import java.util.Scanner;

  class whole_numbers{

   static void disp(int n){
      for(int i=0;i<n;i++){
      System.out.println(i);
          }
       }
 public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter teh value of n:");
      int n=sc.nextInt();
       disp(n);
  }
}