import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NextPermutation {
    public static void nextPerm(int[] nums){
        int n=nums.length;
        int idx=-1;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]) {
                idx=i;
                break;
            }
        }
        if(idx!=-1){
            int j=-1;
            for(int i=n-1; i>idx; i++){
                if(nums[i]>nums[idx]){
                    j=i;
                    break;
                }
            }
            //swap
            int temp=nums[idx];
            nums[idx]=nums[j];
            nums[j]=temp;

            //reverse
            int i1=idx+1;
            int i2=n-1;
            while(i1<i2){
                int temp1 =nums[i1];
                nums[i1]=nums[i2];
                nums[i2]= temp1;
            }
        }
        else
        {
            int i=0;
            int j=n-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        nextPerm(nums);
        System.out.println(Arrays.toString(nums));
    }
}

/*
T.C = O(N)
S.C = O(1)
*/