import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthSmallestElt {
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        Comparator<Integer> comparator = Collections.reverseOrder();
        PriorityQueue<Integer> pq=new PriorityQueue<>(comparator);

        for(int i=l; i<k; i++) pq.add(arr[i]);

        for(int i=k; i<=r; i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }

        return pq.peek();

    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        int[] nums =new int[n];
        for(int i = 0; i< n; i++){
            nums[i]=sc.nextInt();
        }
        int k;
        k =sc.nextInt();
        System.out.println(kthSmallest(nums,0,n-1,k));
    }
}

/*
T.C = O(nlogK)
S.C = O(K)
*/
