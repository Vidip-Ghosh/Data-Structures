import java.util.Scanner;

public class SearchString2 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        name = sc.next();

        char target;
        System.out.println("Enter the character to be searched: ");
        target = sc.next().charAt(0);

        System.out.println(search(name,target));
    }

    static boolean search(String name,char target)
    {
        if(name.length()==0)
        {
            return false;
        }
        for(char ch : name.toCharArray())
        {
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }
}
