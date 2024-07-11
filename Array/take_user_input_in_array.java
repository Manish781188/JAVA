/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class take_user_input_in_array
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size = sc.nextInt();
	    
	    int[] arr = new int[size];

	  //takto  
	    for(int i=0;i<size;i++){
        System.out.println("Enter the element of array at index "+i);
	        arr[i]=sc.nextInt();
	    }
	    
	    for(int x :arr){
	        
	    
		System.out.print(x +" ");
	}
	}
}
