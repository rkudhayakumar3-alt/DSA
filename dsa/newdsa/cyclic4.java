import java.util.*;
public class cyclic4 {
    public static void main(String args[]){
        //    int[] arr = {3,4,7,1,2,5,6,6,7,2};
         int[] arr ={1,2,2,4};
           System.out.println( sort(arr));
    }
      static void swap(int[] arr , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
      }
       static   List<Integer> sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int cor = arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[cor]){
                swap(arr, i, cor);
            }else {
                i++;
            }
        }
        List<Integer> dublicate = new ArrayList<>();
        for(int j =0; j<arr.length;j++){
            if(arr[j]!=j+1 && !dublicate.contains(arr[j])){
                dublicate.add(arr[j]);
                
                
            }
        }
       return dublicate ;
    }
}


      
