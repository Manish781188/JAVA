// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class inverted_palindron_number{
    public static void main(String[] args) {
       for(int i=5;i>=1;i--){
           int num =i;
           int man =2;
           for(int k=1;k<=6-i;k++){
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
               System.out.print(num);
               num--;
           }
           for(int j=1;j<i;j++){
               System.out.print(man);
               man++;
           }
           System.out.println();
       }
       
    }
}