import java.util.*;
public class cyclic2 {
    public static void main(String args[]){
        int[] arr = {3,0,1,2};
       
        System.out.println(sort(arr));
        
    }
    static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
    static int sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int cor = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[cor]){
                swap(arr, i, cor);
            }else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }
}
