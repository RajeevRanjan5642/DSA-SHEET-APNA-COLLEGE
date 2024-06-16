import java.util.Scanner;

public class MaximumProductSubarray {
    public static int maxProduct(int[]nums){
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int prefix=1;
        for(int i=0; i<n; i++){
            prefix*=nums[i];
            maxi=Math.max(maxi,prefix);
            if(prefix==0) prefix=1;
        }
        int suffix =1;
        for(int i=n-1; i>=0; i--){
            suffix *=nums[i];
            maxi=Math.max(maxi, suffix);
            if(suffix ==0) suffix =1;
        }
        return maxi;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxProduct(nums));
    }
}

/*
T.C = O(N)
S.C = O(1)
*/
