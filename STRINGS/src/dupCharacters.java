import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dupCharacters {
    public static void printDuplicates(String s){
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char key=s.charAt(i);
            if(map.get(key)==null) map.put(key,1);
            else map.put(key,map.get(key)+1);
        }
        for(Map.Entry<Character,Integer>e:map.entrySet()){
            if(e.getValue()==1) continue;
            System.out.println(e.getKey()+", count = "+e.getValue());
        }
    }
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        printDuplicates(str);
    }
}

/*
T.C = O(N)
S.C = O(K) k=no.of unique characters
*/
