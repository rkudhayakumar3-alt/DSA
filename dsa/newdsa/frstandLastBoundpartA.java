import java.util.*;

public class frstandLastBoundpartA {
    public static void main(String args[]){
        int[] arr = {5,4,4,2,3,4,6,1};
        int target = 4;
        Arrays.sort(arr);
        int left = left(arr, target);
        int right = right(arr, target);
        System.out.println(Arrays.toString(new int[]{left,right}));

    }
    static int left(int[] arr, int target){
         int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[target]==arr[mid]){
                ans = mid;
                end = mid-1;

            }else if(arr[target]<arr[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
    static int right(int[] arr , int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[target]==arr[mid]){
                ans = mid;
                start = mid+1;

            }else if(arr[target]<arr[mid]){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
