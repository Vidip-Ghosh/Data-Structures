import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        // int[] arr = {18,12,-7,3,14,28};
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimum(arr));
    }
    static int minimum(int[] arr)
    {
        int ans = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
