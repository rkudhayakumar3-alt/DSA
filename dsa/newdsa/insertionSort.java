import java.util.*;
public class insertionSort {
    public static void main(String args[]){
        int[] arr = {5,4,3,1,2};
        insert(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int first ,int sec){
        int temp = arr[first];
        arr[first]=arr[sec];
        arr[sec]= temp;
    }
    static void insert(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
}
