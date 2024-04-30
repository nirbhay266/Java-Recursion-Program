import java.util.Scanner;

public class palindrom {
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
        String rev=reverse(s,0);
        if(rev.equals(s))
        {
            System.out.print("Palindrom");
        }
        else
        {
            System.out.print("Not Palindrom");
        }
    }
}
