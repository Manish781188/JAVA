/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Array_Smaller
{
	public static void main(String[] args) {
	    int[] num1 = {8,1,2,2,3};
	    int[] arr2 = new int[num1.length];
	    for(int i=0;i<num1.length;i++){
	        int count = 0;
	        for(int j=0;j<num1.length;j++){
	            if(num1[i] > num1[j]){
	                count++;
	            }
	            arr2[i]=count;
	        }
	        
	    }
	    //print Array 
	    for(int i=0;i<arr2.length;i++){
	        System.out.print(arr2[i] + " ");
	    }
	    
	}
}