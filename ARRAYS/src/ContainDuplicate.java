import java.util.HashMap;
import java.util.Scanner;

public class ContainDuplicate {
    public static boolean isDuplicate(int[] nums){
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else map.put(nums[i],1);
        }
        return false;
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(isDuplicate(nums));
    }
}

/*
T.C : O(N)
S.C : O(N)
*/
