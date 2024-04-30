public class MaxValue
{
    public static int maximum(int arr[],int idx)
    {
        if(idx== arr.length-1)
        {
            return arr[idx];
        }
        //small problem-idx+1, end of thr array -max _return
        int smallAns=maximum(arr,idx+1);
        //self work
        return Math.max(arr[idx],smallAns);
    }
//    public static void maximum(int n[])
//    {
  //  int mx=Integer.MIN_VALUE;
//        for(int i=0;i<n.length;i++)
//        {
////            mx=Math.max(n[i],mx);
////            if(n[i]>mx)
////            {
////               mx=n[i];
////            }
//        }
//        System.out.println(mx);


    public static void main(String args[])
    {
        int arr[]={1,8,9,88,99,00,87,63,5,7,8};

        System.out.println(maximum(arr,0));

    }
}
