import java.util.Scanner;
public class user_input_in_2D_array{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //take user input
        System.out.println("Enter the valus of rows :");
        int rows = sc.nextInt();
        System.out.println("Enter the valus of cols :");
       int cols = sc.nextInt();
       //difine an array with rows and cols
       int[][] arr = new int[rows][cols];
       //Insert element  inside array
       System.out.println("Enter the Element of 2D array");
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            arr[i][j]=sc.nextInt();
        }
       }
    
    //dispaly the array
    for( int i=0;i<rows;i++){
        for(int   j=0;j<cols;j++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}