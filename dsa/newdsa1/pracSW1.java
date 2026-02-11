import java.util.*;

public class pracSW1 {
    public static void main(String args[]){
        int[] arr = {1,4,1,2,3,1,5};
        int k =7;
        System.out.println(Arrays.toString(longSubArray(arr, k)));
    }
    static int[] longSubArray(int[] arr,int k){
        int left =0;
        int bigR=0;
        int bigL=0;
        int length =0;
        int sum = 0;
        for(int right = 0;right<arr.length;right++){
            sum = sum + arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
             if(length<right-left+1){
                length = right-left+1;
                bigR = right;
                bigL = left;

             }   
        }
        int v=0;
        int[] val = new int[length];
        for(int i=bigL;i<=bigR;i++){
            val[v++]=arr[i];
        }
        return val;
    }
}
