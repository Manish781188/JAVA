
import java.util.Scanner;
public class find_the_length_without_using_lenght_function{
  static int count(String str){
    int count=0;
    for(char ch : str.toCharArray()){
        count++;
    }
    return count;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
	//	int a=count(str);
		System.out.println(count(str));
	}
}

