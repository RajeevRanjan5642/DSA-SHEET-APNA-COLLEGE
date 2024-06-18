import java.util.Scanner;
import static java.lang.System.in;

public class LongestCommonPrefix {
    public static String longestCommonPre(String[] strs){
        if(strs.length==1) return strs[0];
        int minLen=Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        String ans="";
        for(int i=0; i<minLen; i++){
            char ch=strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].charAt(i)!=ch) return ans;
            }
            ans+=ch;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(in);
        n=sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for(int i=0; i<n; i++){
            strs[i]=sc.nextLine();
        }
        System.out.println(longestCommonPre(strs));
    }
}

/*
T.C = O(N*N)
S.C = O(1)
*/