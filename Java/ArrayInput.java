import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        /*Reading the number of elements that we want to enter */
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int[] array = new int[10];
        System.out.println("Enter elements of an array: ");
        for(int i=0;i<n;i++)
        {
            /*Reading the elements of an array */
            array[i] = sc.nextInt();
        }
        System.out.println("Elements of an array are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
}
