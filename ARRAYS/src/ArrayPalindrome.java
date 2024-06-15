import java.util.Scanner;

public class ArrayPalindrome {
    public static int minOperations(int[] nums){
        int minOp=0;
        //
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]==nums[j]){
                i++;
                j--;
            }
            else if(nums[i]>nums[j]){
                j--;
                nums[j]+=nums[j+1];
                minOp++;
            }
            else{
                i++;
                nums[i]+=nums[i-1];
                minOp++;
            }
        }
        return minOp;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(minOperations(nums));
    }
}

/*
T.C = O(N)
S.C = O(1)
*/
