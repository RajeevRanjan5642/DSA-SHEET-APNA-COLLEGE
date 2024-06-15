import java.util.Scanner;

public class Buy_sellStocks {
    public static int maxProfit(int[] nums){
        int n=nums.length;
        int profit=0;
        int mini=nums[0];
        for(int i=1; i<n; i++){
            if(nums[i]<mini) mini=nums[i];
            else{
                if((nums[i]-mini)>profit)
                    profit=nums[i]-mini;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(maxProfit(nums));
    }
}

/*
T.C = O(N)
S.C = O(1)
*/