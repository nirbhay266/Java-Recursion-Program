public class findlastKey {
    public static int findkey(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = findkey(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String args[])
    {
        int arr[]={2,4,5,6,8,9,5,4,1};
        System.out.println(findkey(arr,5,0));
    }
}
