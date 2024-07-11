

import java.util.Scanner;
public class replace_word{
    static String replaseword(String str, String replace_word,String replaced){
        String[] word = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length;i++){
            if(replace_word.equals(word[i])){
                sb.append(replaced);
                sb.append(" ");
            }
            else{
                sb.append(word[i]);
                sb.append(" ");
            }
        }
        return new String(sb);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str = sc.nextLine();
       String arr[] =str.split(" ") ;
       
        System.out.println("Enter the replace word");
        String replace_word= sc.nextLine();

        System.out.println("Enter the replased string ");
       String replaced = sc.nextLine();
       
       System.out.println(replaseword(str, replace_word, replaced));
    }
}