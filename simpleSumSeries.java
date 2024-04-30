import java.util.Scanner;

public class simpleSumSeries {
    public static int series(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return series(n-1)+n;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
      System.out.println(series(n));
    }

}
