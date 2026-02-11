import java.util.*;
public class j39partB {
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,4,4,4,4,4,4,5,6};
    int target = 4;
    System.out.println(Arrays.toString(gon(arr, target)));

   } 
   static int goo(int[] arr, int target, boolean bound){
    
    int ans = -1;
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            ans = mid;
            if(bound){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }else if(arr[mid]<target){
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return ans;
   }
   static int[] gon(int[] arr , int target){
    int[] ans = {-1,-1};
    ans[0] =  goo(arr, target,true);
    ans[1] =  goo(arr,target,false);
    return ans;
   }
}
