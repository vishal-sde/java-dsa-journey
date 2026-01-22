import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 Names:");
        for (int i = 0; i < names.length; i++) {
            names[i]=sc.nextLine();
        }
        System.out.println("Enter the target");
        String target = sc.nextLine();
        System.out.println(find(names,target));
    }

    static boolean find(String[] arr,String target){
        if(arr.length==0){
            return false;
        }

        for(int i = 0 ;i< arr.length;i++){
            if(arr[i].equals(target)){
                return true;
            }
        }
        return false;
    }
}
