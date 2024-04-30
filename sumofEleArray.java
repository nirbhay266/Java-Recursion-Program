public class sumofEleArray {
    public static int sumOfArray(int[] arr, int idx)
    {
        //base case
        if(idx==arr.length)
        {
            return 0;
        }
        //sub problem
        int smallAns=sumOfArray(arr,idx+1);
        //self work
        return smallAns+arr[idx];
    }
    public static void main(String[] args)
    {
        int[] arr ={2,1,3,4,5};
        System.out.println(sumOfArray(arr,0));
    }
}
