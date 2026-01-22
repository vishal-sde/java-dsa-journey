import java.util.Scanner;

public class SearchinaString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        String name = sc.nextLine();
        char target = sc.next().charAt(0);
        System.out.println(find(name,target));
    }

    static boolean find(String name,char target){
        for(int  i = 0;i<name.length();i++)
            if (name.charAt(i) == target) {
                return true;
            }
        return false;
    }
}
