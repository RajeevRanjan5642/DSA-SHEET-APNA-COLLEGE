import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static int minDiff(int[] nums,int m){
        Arrays.sort(nums);
        int mini = Integer.MAX_VALUE;
        int i=0;
        int j=m-1;
        while (j<nums.length){
            int diff = nums[j]-nums[i];
            if(diff<mini) mini=diff;
            i++;
            j++;
        }
        return mini;
    }
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        m=sc.nextInt();
        System.out.println(minDiff(nums,m));
    }
}

/*
Nlog(N)+N
T.C = O(Nlog(N))
S.C = O(1)
*/
