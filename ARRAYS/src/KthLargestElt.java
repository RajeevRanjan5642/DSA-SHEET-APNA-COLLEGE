import java.util.ArrayList;
import java.util.Scanner;

class Heap{
    private ArrayList<Integer>list;
    Heap(){
        list=new ArrayList<>();
    }

    public void swap(int a,int b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }

    public void insert(int d){
        list.add(d);
        int idx=list.size()-1;
        int parentIdx=(idx-1)/2;
        while(idx>0 && list.get(parentIdx)>list.get(idx)){
            swap(idx,parentIdx);
            idx=parentIdx;
            parentIdx=(idx-1)/2;
        }
    }
    private void heapify(int idx){
        int left=2*idx+1;
        int right=2*idx+2;
        int minIdx =idx;
        if(left<list.size() && list.get(minIdx)>list.get(left)) minIdx =left;
        if(right<list.size() && list.get(minIdx)> list.get(right)) minIdx =right;
        if(minIdx !=idx){
            swap(minIdx,idx);
            heapify(minIdx);
        }
    }
    public void remove(){
        if(list.isEmpty()) return;
        int lastIdx=list.size()-1;
        swap(0,lastIdx);
        list.remove(list.size()-1);
        heapify(0);
    }
    public int get(){
        return list.get(0);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}



public class KthLargestElt {
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
        Heap hp=new Heap();
        for(int i=0; i<k; i++){
            hp.insert(nums[i]);
        }

        for(int i=k; i<n; i++){
            if(hp.get()<nums[i]) {
                hp.remove();
                hp.insert(nums[i]);
            }
        }
        System.out.println(hp.get());
    }
}

/*
T.C = O(nlogK)
S.C = O(K)
*/
