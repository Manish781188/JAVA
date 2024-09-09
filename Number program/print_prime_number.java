import java.util.Scanner;
class print_prime_number{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of num1 and num2");
      int num1=sc.nextInt();
       int num2=sc.nextInt();
     int  sum=0;
     for(int i=num1;i<=num2;i++){
      int n=i;
      int flag=0;
      if(n==1){
        flag++;
      }
      else{
      for(int j=2;j<n;j++){
        if(n%j==0){
          flag++;
        }
      }
      }
      if(flag==0){
        System.out.print(n + " ");
         sum+=n;
      }
     }
     System.out.println();
     System.out.println(sum);
      
    }
}

/////////////////////////////////
 //int i,j;
   //  for( i=num1;i<=num2;i++){
     //       for(j=2;j<=i;j++){
       //         if(i%j==0){
         //           break;
           //     }
  //          }
    //        if(i==j){
      //          System.out.print(i+" ");
        //    }
  //   }
      



