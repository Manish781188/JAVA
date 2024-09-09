import java.util.Scanner;
class ckech_perfect_number{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of num1 and num2");
      int num1=sc.nextInt();
      int sum=0;
      for(int i=1;i<num1;i++){
        if((num1%i)==0){
      System.out.print( +i+"  ");
      sum+=i;
        }
       
      }
     System.out.println();
      System.out.println("Sum = " + sum);
      if(sum==num1){
        System.out.println("This is a perfect numbert");
      }
      else{

        System.out.println("This is  not a perfect number");
      }
    }
}
 




