import java.util.*;
public class j21 {
    public static void main(String args[]){
        int[] arr = {1,2,4,5,3,6};
        reverse(arr);
        System.out.println( Arrays.toString(arr));

    } 
    static void reverse(int[] arr){
        
        int start = 0;
        int end = arr.length-1;
        while(start<end ){
            swap(arr,start,end) ;
            start++;
            end--;

        }
    }
    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    
}
