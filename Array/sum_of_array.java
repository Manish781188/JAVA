/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class sum_of_array
{
    static int sumarr(int[] arr){
        int sum=0;
        for(int x : arr){
            sum+=x;
        }
        return sum;
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
	System.out.println("sum of all element in arr =" + sumarr(arr));
	}
}
