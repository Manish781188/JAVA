import java.util.Scanner;
public class hellow_diamond{


public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the nuber of row");
    int row = sc.nextInt();

    for(int i= 1; i<=row;i++){
        for(int k=0;k<=(row+1-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(j==1 || j==2*i-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
         System.out.println();
    }
  for(int i= row; i>=1;i--){
        for(int k=0;k<=(row+1-i);k++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            if(j==1 || j==2*i-1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
         System.out.println();
    }
}
}