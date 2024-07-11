

public class halfupper_halflower
{
    
    static String upper(String str)
    {
        String upperString = "";
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
                int ascii = (int)(str.charAt(i));
                int newascii = ascii-32;
                char ch = (char)newascii;
                upperString = upperString+ch;
            }
            else{
                upperString = upperString+str.charAt(i);
            }
        }
        return upperString;
    }
    
     static String lower(String str)
    {
        String lowerString = "";
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
                int ascii = (int)(str.charAt(i));
                int newascii = ascii+32;
                char ch = (char)newascii;
                lowerString = lowerString+ch;
            }
            else{
                lowerString = lowerString+str.charAt(i);
            }
        }
        return lowerString;
    }
    
    static String removeSpace(String str)
    {
        String newstr = "";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                newstr = newstr+str.charAt(i);
            }
        }
        return newstr;
    }
    
    static String convert(String str)
    {
        String firstHalf = "";
        String secondHalf = "";
        int mid = str.length()/2;
        for(int i=0;i<=mid;i++)
        {
            firstHalf = firstHalf+str.charAt(i);
        }
        for(int i=mid+1;i<str.length();i++)
        {
            secondHalf = secondHalf+str.charAt(i);
        }
        return (upper(removeSpace(firstHalf))+" "+lower(removeSpace(secondHalf)));
    }
	public static void main(String[] args) {
		System.out.println(convert("Programming IS Fun"));
	}
}
