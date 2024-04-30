public class nuberAddition
{
    public static int SOD(int n)
    {
        if(n>=0&&n<=9)
        {
            return n;
        }
        //int smallAns=SOD(n/10);
//        int ANS=smallAns+n%10;
//        return ANS;
       // return smallAns+n%10;
        return SOD(n/10)+n%10;

    }
    public static void main (String[] args)
    {
        System.out.println(SOD(12345));
    }
}
