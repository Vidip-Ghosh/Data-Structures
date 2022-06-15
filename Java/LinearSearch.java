import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // int[] arr = {3,45,1,2,8,19,-3,16,-11,28};
        int[] arr = new int[10];
        int target;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of an array ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        target = sc.nextInt();
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }
    //Searching in the array
    static int linearSearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        //run a for loop
        for(int index=0;index<arr.length;index++)
        {
            //check for every element at index if its equal to target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
