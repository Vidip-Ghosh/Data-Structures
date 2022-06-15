import java.util.Scanner;

public class ArrayInput2 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        Scanner sc = new Scanner(System.in);
        
        /*Reading the number of elements */
        System.out.print("Enter size of an array: ");
        int n;
        n = sc.nextInt();

        /*Reading elements of an array */
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        /*Display */
        System.out.println("Displaying the array: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
