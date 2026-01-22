import java.util.Scanner;

public class LinearSearchstr {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        char target = scan.next().charAt(0);
        System.out.println(is(name,target));
    }

    static boolean is(String str,char target){
        if(str.length()==0){
            return true;
        }

        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}