public class findAllIndex {
    public static void findIndex(int a[],int n,int target,int idx)
    {
        //base case
        if(idx>=n)
        {
            return;
        }
        //self work
        if(a[idx]==target)
        {
            System.out.println(idx);
        }
        //recursion
        findIndex(a,n,target,idx+1);
    }
    public static void main(String args[])
    {
        int[] a={1,2,3,4,2,4,5,4};
        int target=4;
        int n=a.length;
        findIndex(a,n,target,0);
    }
}
