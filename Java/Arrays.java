public class Arrays {
    public static void main(String[] args) {
        int [] intArr;  /*Declaring an array */
        intArr = new int[5];    /*Allocating memory to an array */
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;
        //change an array element
        intArr[0] = 10;
        for(int i=0;i<intArr.length;i++)
        {
            System.out.println("Element at index "+ i + "is:"+intArr[i]);
        }

        int [] arr = {1,3,5,7,9,11,13,15};
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println("Elements of new array: "+arr[i]);
        // }
        /*loop through an array with for-each */
        for(int i: arr){
            System.out.println(i);
        }
    }
}
