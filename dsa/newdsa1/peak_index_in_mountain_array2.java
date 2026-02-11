public class peak_index_in_mountain_array2 {
      public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,4,3,2};
        System.out.println(goo(arr));
        
    }
    static int goo(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for(int i = start ; i<=end; i++){
            if(arr[i]<arr[i+1] && arr[i+1]>arr[i+2]){
                return i ; 
            }
        }
        return -1;
    }
}
