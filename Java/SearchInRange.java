import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        // int[] arr = {18,12,-7,3,14,28};
        int [] arr = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        //run a for loop
        for(int index=start;index<=end;index++)
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
