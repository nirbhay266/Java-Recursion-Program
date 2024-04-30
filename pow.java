public class pow {
    public static int POW(int p,int q)
    {
        if(q==0)
        {
            return 1;
        }
        int smallAns=POW(p,q-1);
        return smallAns*p;
    }

    public static void main(String[] args)
    {
        int n=5,k=2;
        System.out.println(POW(n,k));
    }
}
