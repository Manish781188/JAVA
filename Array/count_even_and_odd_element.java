/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class count_even_and_odd_element
{
    static void count(int[] arr){
        int sum=0;
        int even_count=0;
        int odd_count=0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even_count++;
                
            }
            else{
                odd_count++;
        }
       
        
    }
    System.out.println("even numbrs arr :"+ even_count);
         System.out.println("even numbrs arr :"+ odd_count);
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array ");
	int size = sc.nextInt();
	int[] arr = new int[size];
	for(int i=0;i<size;i++){
	    System.out.println("Enter the element of array at index " +i);
	    arr[i] = sc.nextInt();
	}
       count(arr);
	}
}
