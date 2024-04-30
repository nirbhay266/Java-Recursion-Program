import java.util.Scanner;

public class removeCharecter {
    public static String removea(String s,int idx) {
        //base case
        if(idx==s.length())
        {
            return " ";
        }
        //recursion
        String smallAns=removea(s,idx+1);
        char currchar=s.charAt(idx);
        //self work
        if(currchar!='a')
        {
            return currchar+smallAns;
        }
        else {
            return smallAns;
        }

    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(removea(s,0));
    }
}
