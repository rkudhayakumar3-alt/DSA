import java.util.*;
public class cyclic1 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        cyc(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyc(int[] arr){
        int i=0;
        while(i<arr.length){
            int index = arr[i] -1;
            if(arr[index]!=arr[i]){
                swap(arr, i, index);
            }else{
                i++;
            }
            
        }
    }
     static void swap(int[] arr, int first ,int sec){
        int temp = arr[first];
        arr[first]=arr[sec];
        arr[sec]= temp;
    }
}
