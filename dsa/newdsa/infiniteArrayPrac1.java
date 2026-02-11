public class infiniteArrayPrac1 {
    public static void main(String args[]){
        int[] arr = {9,8,7,5,6,3,4,1,2}; 
        // where u cant use {end =arr.length-1} cause its infinite array
        int target = 8;
        System.out.println();

    }
    static int range(int[] arr , int target){
        int start = 0;
        int end = 1;
        
         
        while(arr[end]<target){
           int temp  = end+1;
            end  = end + (end-start+1)*2;
            start = temp;
        }
        
        return binary(arr, target, start, end);
    }
    static int binary(int[] arr , int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
