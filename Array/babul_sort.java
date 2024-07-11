/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class babul_sort
{
    static void  sort(int[] num1){
        for(int i=0;i<num1.length;i++){
            for(int j=i+1;j<num1.length;j++){
                if(num1[i]>num1[j]){
                    int temp =num1[i];
                    num1[i]=num1[j];
                    num1[j]=temp;
                }
            }
        }
        for(int i=0;i<num1.length;i++){
            System.out.print(num1[i] + " ");
        }
    }
	public static void main(String[] args) {
	    int[] num1 = {5,4,1,7,9,2};
	    
	   sort(num1);
	    
	}
}