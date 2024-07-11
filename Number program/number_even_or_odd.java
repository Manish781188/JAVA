
import java.util.Scanner;

  class number_even_or_odd {

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
   for(int i=1;i<=100;i++){
 if(Even(i)){
 System.out.println(i);
}
}
   
 for(int i=20;i<=35;i++){
 if(Odd(i)){
 System.out.println(i);
}
}
} 
 }