import java.util.Scanner;

public class SearchInRotatedArray {
    public static int search(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<nums[low]){
                if(target>nums[mid]&&target<=nums[high]) low=mid+1;
                else  high=mid-1;
            }
            else {
                if(target>=nums[low]&&target<nums[mid]) high=mid-1;
                else  low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int target;
        target=sc.nextInt();
        System.out.println(search(nums,target));
    }
}

/*
Approach = Binary Search
T.C = O(log(N))
S.C = 0(1)
*/
