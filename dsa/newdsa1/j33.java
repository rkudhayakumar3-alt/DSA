import java.util.*;
public class j33 {
    public static void main(String[] args) {
        int[] arr = {4,2,8,7};
        int target = 5;
        int ans = goo(arr, target);
        System.out.println(ans);
    }
    static int goo(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                 
                end = mid-1;
            }else{
                start= mid+1;
                // end = arr.length-1;
            }
        }
        if(start<arr.length){
            return arr[start-1];
        }else{
            return -1;
        }

    }
}
