import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] nums){
        int n=nums.length;
        for(int i=0; i<n/2; i++){
            int temp=nums[i];
            nums[i]=nums[n-1-i];
            nums[n-1-i]=temp;
        }
        return;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        reverse(nums);
        System.out.println("After Reversing : ");
        System.out.println(Arrays.toString(nums));
    }
}
