public class Sum_of_Arrays {
    public static void main(String[] args) {
        int arr[] = {2,1,3,4,5,6,7,8};
        sum(arr);
    }
    public static void sum(int[] arr)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println("Sum of elements of an array: "+sum);
    }
}
