import java.util.Scanner; 

public class Additon_of_two_matrix{

static void matrixSum(int[][] arr1, int[][] arr2, int row1, int row2, int col1, int col2) 
{ 
    //3rd matrix 
int[][] sumArray = new int[row1][col1]; 
 if(row1==row2 && col1==col2) 
{  for(int i=0;i<row1;i++) 
 { 
 for(int j=0;j<col2;j++) 
 { 
 sumArray[i][j]=arr1[i][j]+arr2[i][j]; 
 } 
 }  } 
 //diplay 
 for(int i=0;i<row1;i++) 
 { 
 for(int j=0;j<col2;j++) 
 { 
 System.out.print(sumArray[i][j]+" "); 
 } 
  System.out.println(); 
 } 
} 

public static void main(String[] args) { 
   Scanner sc = new Scanner(System.in); 
 //one array created 
 System.out.println("Enter the number of row for 1st array: "); 
 int row1 = sc.nextInt(); 
 System.out.println("Enter the number of col for 1st array: "); 
 int col1 = sc.nextInt(); 
 int[][] arr1 = new int[row1][col1]; 
 System.out.println("Enter the  elements in 1st array:(row1 x col1) "); 
 for(int i=0;i<row1;i++) 
 { 
 for(int j=0;j<col1;j++) 
 { 

arr1[i][j] = sc.nextInt(); 
     
 } 
 } 
 //Second array created 
   System.out.println("Enter the number of row 2nd array: "); 
 int row2 = sc.nextInt(); 
 System.out.println("Enter the number of col 2nd array: "); 
 int col2 = sc.nextInt(); 
   int[][] arr2 = new int[row2][col2]; 
   System.out.println("Enter the elements in 2nd array:(row2 x col2) "); 
 for(int i=0;i<row2;i++) 
 { 
 for(int j=0;j<col2;j++) 
 { 
 
  arr2[i][j] = sc.nextInt(); 
 } 
 } 
   matrixSum(arr1,arr2,row1,row2,col1,col2); 
} 
}