public class pairfriend {
    public static int friend(int n)
    {
        if(n==1||n==2)
        {
            return n;
        }
        int fnm1=friend(n-1);
        int fnm2=friend(n-2);
        int totways=(n-1)*fnm2;
        return fnm1+totways;
    }
    public static void main(String[] args)
    {
       int n=3;
      System.out.println(friend(n));
    }
}
