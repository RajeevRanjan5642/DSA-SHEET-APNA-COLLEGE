import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key1=s.charAt(i);
            char key2=t.charAt(i);
            if(map.get(key1)==null) map.put(key1,1);
            else map.put(key1,map.get(key1)+1);
            if(map.get(key2)==null) map.put(key2,-1);
            else map.put(key2,map.get(key2)-1);
        }
        for (Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue()!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s,t;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        t=sc.nextLine();
        System.out.println(isAnagram(s,t));
    }
}

/*
T.C = O(N)
S.C = O(N)
*/