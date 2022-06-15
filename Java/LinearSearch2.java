import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
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

        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int element : arr)
        {
            if(element == target){
                return element;
            }
        }
        return -1;
    }
}
