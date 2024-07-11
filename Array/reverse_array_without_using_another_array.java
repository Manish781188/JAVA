/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class reverse_array_without_using_another_array
{
    static int[] rarr(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
      
        }
        return arr;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of array");
	    int size = sc.nextInt();
	    
	    int[] arr = new int[size];
	    
	    //input element of array
	    for(int i=0;i<size;i++){
	        System.out.println("Enter the element of array at index "+i);
	        arr[i]=sc.nextInt();
	    }
	    
	    for(int x :rarr(arr)){
	        System.out.print(x + " ");
	    }
	        
	}
	    
	}
	
