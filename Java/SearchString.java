import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {
        // String name = "Vidip";
        // char target = 'i';
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        name = sc.next();

        char target;
        System.out.println("Enter the character to be searched: ");
        target = sc.next().charAt(0);
        System.out.println(Search(name,target));
    }
    static boolean Search(String str,char target){
        if(str.length()==0)
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
}
