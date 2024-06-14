import java.util.Scanner;

public class MaximumSubarray {
    public static int maxSum(int[] nums){
        int currSum=0;
        int maxSum1=Integer.MIN_VALUE;
        int maxElt=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currSum+=nums[i];
            if(currSum<0) currSum=0;
            if(maxSum1<currSum) maxSum1=currSum;
            if(maxElt<nums[i]) maxElt=nums[i];
        }
        if(maxElt<0) return maxElt;
        else return maxSum1;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        int sum = maxSum(nums);
        System.out.println(sum);
    }
}
/* solved using KADANE'S ALGORITHM*/
/*
 T.C : O(N)
 S.C : O(N)
*/

