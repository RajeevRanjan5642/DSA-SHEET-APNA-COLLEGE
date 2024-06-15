import java.util.Scanner;

public class containerWithMostWater {
    public static int maxAmount(int[] height){
        int i=0;
        int j=height.length-1;
        int maxAmt=Integer.MIN_VALUE;
        while(i<j){
            if(height[i]==height[j]){
                maxAmt = Math.max(maxAmt,height[i]*(j-i));
                i++;
                j--;
            }
            else if(height[i]<height[j]){
                maxAmt = Math.max(maxAmt,height[i]*(j-i));
                i++;
            }
            else {
                maxAmt = Math.max(maxAmt, height[j] * (j - i));
                j--;
            }
        }
        return maxAmt;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxAmount(nums));
    }
}
