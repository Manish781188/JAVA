/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class linear_search
{
    static boolean  narr(int[] num1,int key){
        for(int i=0;i<num1.length;i++){
	        if(num1[i]==key){
	           return true;
	        }
	       
	    }
	    return false;
    }
	public static void main(String[] args) {
	    int[] num1 = {5,4,1,7,9,2};
	    int key = 4;
	    System.out.println(narr(num1,key));
	    
	}
}