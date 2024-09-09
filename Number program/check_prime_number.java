import java.util.Scanner;
class check_prime_number{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of num");
      int num=sc.nextInt();
      int flag=0;
      for(int i=2;i<num;i++){
       if(num%i==0){
        flag++;
       }
      }
      
      if(flag==0){
        System.out.println("this is a prime number");
      }
      else{
        System.out.println("this is a not a prime number");
      }
    }
}
 




