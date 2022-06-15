class Student{
    public int rollNo;
    public String name;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}
public class Array_Of_Objects {
    public static void main(String[] args) {
        Student [] arr;
        arr = new Student[5];
        arr[0] = new Student(1,"Aman");
        arr[1] = new Student(2, "Rohan");
        arr[2] = new Student(3, "Saksham");
        arr[3] = new Student(4, "Mohit");

        for(int i=0;i<=arr.length;i++)
        {
            System.out.println(arr[i].name + ":" + arr[i].rollNo);
        }
    }
}
