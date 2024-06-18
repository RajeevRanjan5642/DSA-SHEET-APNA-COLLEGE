import java.util.Scanner;

public class RemoveConsecutiveCharacters {
    public static String remove(String str){
        String ans="";
        ans+=str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)) ans+=str.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(remove(str));
    }

    /*
    T.C = O(N)
    S.C = O(1)
    */
}
