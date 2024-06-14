import java.util.Scanner;
public class MinMax{
    static class pair{
        int first;
        int second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static pair findMinMax(int[] nums){
        int n=nums.length;
        int maxi=nums[0];
        int mini=maxi;
        for(int i=1; i<n-1; i+=2){
            if(nums[i]>nums[i+1]){
                maxi=Math.max(maxi,nums[i]);
                mini=Math.min(mini,nums[i+1]);
            }
            else{
                maxi=Math.max(maxi,nums[i+1]);
                mini=Math.min(mini,nums[i]);
            }
        }
        if(n%2==0) {
            maxi = Math.max(maxi, nums[n - 1]);
            mini = Math.min(mini, nums[n - 1]);
        }
        return new pair(maxi,mini);
    }
    public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int[] nums=new int[N];
        for(int i=0; i<N; i++){
            nums[i]=sc.nextInt();
        }
        pair ans = findMinMax(nums);
        System.out.println(ans.first);
        System.out.println(ans.second);
    }
}

/*
Time Complexity: O(N)
No. of comparisons :
for even N: 3(N-2)/2+1;
for odd N: 3(N-1)/2
Space Complexity: O(1)
*/
