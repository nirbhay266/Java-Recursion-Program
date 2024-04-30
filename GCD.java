import java.util.Scanner;

//Given two numbers X and Y find the Greatest common divisor of X and Y
//LCM
public class GCD {
    public static int retest(int x, int y)
    {
        if(y==0)
        {
            return x;
        }
        return retest(y,x%y);
//       while(x%y!=0)
//       {
//           int rem=x%y;
//           x=y;
//           y=rem;
//       }
//       return y;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        System.out.println(retest(x,y));
    }
}
