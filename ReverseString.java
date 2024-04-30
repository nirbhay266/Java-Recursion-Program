import java.util.Scanner;

public class ReverseString {
    public static String reverse(String s,int idx)
    {
        if(idx==s.length())
        {
            return "";
        }
        String smallans=reverse(s,idx+1);
        return smallans+s.charAt(idx);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.printf(reverse(s,0));
    }
}
