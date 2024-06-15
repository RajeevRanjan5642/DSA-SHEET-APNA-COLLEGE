import java.util.Scanner;

public class MinInRotatedSortedArray {
    public static int minElt(int[] nums){
        int low=0;
        int high=nums.length-1;
        int mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[low])
            {
                mini=Math.min(mini,nums[low]);
                low=mid+1;
            }
            else{
                mini=Math.min(mini,nums[mid]);
                high=mid-1;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(minElt(nums));
    }
}

/*
Binary Search
T.C = O(logN)
S.C = O(1)
*/
