public class powEvenOdd
{
    public static int pow(int p,int q)
    {
        if(q==0)
        {
            return 1;
        }
        int half=pow(p,q/2);
        int halfpower=half*half;
        if(q%2!=0)
        {
            halfpower=p*halfpower;
        }
        return halfpower;
    }
    public static void main(String[] args)
    {
        int p=2,q =5;
        System.out.println(pow(p,q));
    }
}
