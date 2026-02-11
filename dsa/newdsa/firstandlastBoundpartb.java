import java.util.*;
public class firstandlastBoundpartb {
    public static void main(String args[]){
        int arr[] = {5,4,4,2,3,4,6,1};
        int target = 4;
        Arrays.sort(arr);
        int[] a =  goo(arr, target);
        System.out.println(Arrays.toString(a));
    }
    static int[] goo(int[] arr , int target){
        int[] ans = {-1,-1};
        ans[0] = bound(arr,target, true);
        if(ans[0] != -1){
            ans[1] = bound(arr, target, false);
        }
        return ans;
    }

    static int bound(int[] arr , int target,boolean firstLast){
        int start = 0;
        int ans = -1;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]){
                ans = mid;
                if(firstLast==true){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }
}
