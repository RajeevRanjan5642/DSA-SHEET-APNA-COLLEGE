import java.util.Scanner;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int n=height.length;
        if(n==1 || n==2) return 0;
        int[] right_max=new int[n];
        right_max[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            right_max[i]=Math.max(right_max[i+1],height[i+1]);
        }
        int sum=0;
        int left_max=height[0];
        for(int i=1; i<n; i++){
            if(height[i]<left_max && height[i]<right_max[i]){
                sum+=Math.min(left_max,right_max[i])-height[i];
            }
            left_max=Math.max(left_max,height[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(trap(nums));
    }
}

/*
T.C = O(N)
S.C = O(N)
*/
