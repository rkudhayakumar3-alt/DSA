import java.util.*;
public class bubbleSort {
    public static void main(String args[]){
        // int[] arr = {5,4,3,2,1};
        int[] arr = {1, 2, 3, 4, 5};
        goo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void goo(int[] arr){
        // boolean swap;
        
        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
   
    }
}
