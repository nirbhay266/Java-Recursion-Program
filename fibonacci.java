public class fibonacci
{
    public static int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int pre=fib(n-1);
        int prepre=fib(n-2);
        return pre+prepre;
    }
    public static void main(String[] args)
    {
        int n=4;
        System.out.println(fib(n));
    }
}
