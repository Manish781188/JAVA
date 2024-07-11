/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class butterfly
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    for(int k=1;k<=2*(n-i);k++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
	//	int num=4;
		for(int i=n-1;i>=1;i--){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    for(int k=1;k<=2*(n-i);k++){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
		
	}
}
