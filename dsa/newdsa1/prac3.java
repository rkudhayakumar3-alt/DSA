import java.util.*;
public class prac3 {
  public static void main(String[] args ){
    int[] arr =  {14, 16, 18,2, 3, 5, 9};
    int target ;
    Arrays.sort(arr);
    System.out.println(goo(arr,15));
   }
   static int goo(int[] arr,int target){
    if(target>arr[arr.length-1]){
        return-1;
    }
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(target<arr[mid]){
            end = mid-1;
        }else if(target>arr[mid]){
            start=mid+1;
        }else{return mid;}
    }
    return start;
   }
}
