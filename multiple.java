import java.util.Scanner;

public class multiple {
    public static void mul(int n,int k)
    {
        //base case
        if(k==1)
        {
            System.out.println(n);
            return;
        }
        //recursion
        mul(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        mul(n,k);
    }
}
