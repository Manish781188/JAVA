import java.util.Scanner;
class check_two_string_equal_Or_not_without_using_equal_function
{
static boolean isEqual(String str1,String str2){
if(str1.length()!=str2.length()){
   return false;
    }
  for(int i=0;i<str1.length();i++){
    if(str1.charAt(i)!=str2.charAt(i)){
    return false;
        }
    }
   return  true;
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first string");
String str1 =sc.nextLine();
System.out.println("Enter the second string");
String str2 = sc.nextLine();
 
if(isEqual(str1,str2)){
System.out.println(" the strings are equal");
}
else{
System.out.println("the are strings are not equal");
}
}
}