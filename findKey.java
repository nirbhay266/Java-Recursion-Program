public class findKey {
    public static int FINDKEY(int arr[],int key,int i)
    {
        if(i== arr.length)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
       return FINDKEY(arr,key,i+1);
    }
    public static void main(String args[])
    {
        int arr[]={5,7,8,9,5,3,4,9,6,3,1};
        System.out.println(FINDKEY(arr,9,0));
    }

}
