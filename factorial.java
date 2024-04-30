public class factorial {
    public static int printFac(int n)
    {
        if(n ==0) return 1;
//        int fnm=printFac(n-1);
//        int fn=n*printFac(n-1);
        return n*printFac(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(printFac(n));

    }
}
