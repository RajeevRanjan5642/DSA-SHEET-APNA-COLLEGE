import java.util.Scanner;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class ValidPalindrome {
    public static boolean ispalindrome(String s){
        if(s.isEmpty()) return true;
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        if(s.isEmpty()) return true;
        int n=s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(ispalindrome(str));
    }
}

/*
T.C = O(N);
S.C = O(N)
*/
