import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {
    public static int[] productArray(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        //left cumulative pro
        for(int i=1; i<n; i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int right=1;
        //right cumulative pro
        for(int i=n-1; i>=0; i--){
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        int[] ans = productArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}

/*
T.C = O(N)
S.C = O(1)
*/