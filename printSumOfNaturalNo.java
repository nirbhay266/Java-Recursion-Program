public class printSumOfNaturalNo {
    public static int calcSum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int sum1=calcSum(n-1);
        int sum2=n+sum1;
        return sum2;
    }
    public static void main(String[] args) {
     int n=5;
     System.out.println(calcSum(n));   
    }
}
